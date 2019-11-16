package com.qfedu.service.impl;

import com.alibaba.fastjson.JSON;
import com.qfedu.config.RabbitMQQueueConfig;
import com.qfedu.config.RedisKeyConfig;
import com.qfedu.dao.AppointmentDao;
import com.qfedu.entity.Appointment;
import com.qfedu.entity.Record;
import com.qfedu.service.AppointmentService;
import com.qfedu.util.RedissionUtil;
import com.qfedu.vo.Result;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:34
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Autowired
    private AppointmentDao appointmentDao;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public Result add(Appointment appointment) {
        Appointment appointment1 = appointmentDao.save(appointment);
        if (appointment1 != null) {
//新增预约信息成功，发送RabbitMQ
            rabbitTemplate.convertAndSend(RabbitMQQueueConfig.YUYUE_QUEUE, JSON.toJSONString(appointment1));
            return Result.success();
        } else {
            return Result.fail();
        }
    }

    @Override
    public Result selectAll() {
        if (RedissionUtil.checkKey(RedisKeyConfig.YUYUE_KEY)) {

            //先从redis中获取，没有再从数据库获取，然后再放入redis
            Collection<Object> es = RedissionUtil.getHash(RedisKeyConfig.YUYUE_KEY);
            List<Appointment> list = new ArrayList<>(es.size());
            for (Object e : es) {
                list.add(JSON.parseObject((String) e, Appointment.class));
            }
            return Result.success(list);
        } else {
            List<Appointment> list = appointmentDao.findAll();
            Map<Object, String> map = new HashMap<>();
            for (Appointment a : list) {
                map.put(a.getId(), JSON.toJSONString(a));
            }
            RedissionUtil.putAllHash(RedisKeyConfig.YUYUE_KEY, 24 * 3600, map);
            return Result.success(list);
        }

    }
}

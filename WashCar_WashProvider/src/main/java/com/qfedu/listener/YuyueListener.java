package com.qfedu.listener;

import com.alibaba.fastjson.JSON;


import com.qfedu.config.RabbitMQQueueConfig;
import com.qfedu.config.RedisKeyConfig;
import com.qfedu.entity.Appointment;
import com.qfedu.util.RedissionUtil;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(queues = RabbitMQQueueConfig.YUYUE_QUEUE) //消息监听器
public class YuyueListener {
    @RabbitHandler //处理消息
    public void handler(String str){
        //更新到Redis中
        Appointment appointment= JSON.parseObject(str,Appointment.class);
        RedissionUtil.putHash(RedisKeyConfig.YUYUE_KEY,appointment.getId()+"",str);
    }
}

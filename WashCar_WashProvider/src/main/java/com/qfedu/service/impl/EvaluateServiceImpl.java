package com.qfedu.service.impl;

import com.qfedu.dao.AppointmentDao;
import com.qfedu.dao.EvaluateDao;
import com.qfedu.entity.Appointment;
import com.qfedu.entity.Evaluate;
import com.qfedu.myenum.LogType;
import com.qfedu.service.AppointmentService;
import com.qfedu.service.EvaluateService;
import com.qfedu.service.RecordService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:34
 */
@Service
public class EvaluateServiceImpl implements EvaluateService {
    @Autowired
    private EvaluateDao evaluateDao;
    @Autowired
    private RecordService recordService;

    @Override
    public Result add(Evaluate evaluate) {
        try {
            evaluateDao.save(evaluate);
            recordService.saveLog(evaluate.getOrderId(), LogType.PingJia.getType(), "完成了评价");
            return Result.success();
        } catch (Exception e) {
            return Result.fail();
        }


    }

    @Override
    public Result selectAll() {
        return Result.success(evaluateDao.findAll());
    }
}

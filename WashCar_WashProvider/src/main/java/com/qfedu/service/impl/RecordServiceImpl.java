package com.qfedu.service.impl;

import com.qfedu.dao.OrderDao;
import com.qfedu.dao.RecordDao;
import com.qfedu.entity.Order;
import com.qfedu.entity.Record;
import com.qfedu.service.OrderService;
import com.qfedu.service.RecordService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:34
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;

    @Override
    public void add(Record record) {
       recordDao.save(record) ;

    }

    @Override
    public void saveLog(int oid, String type, String info) {
        Record record = new Record();
        record.setOid(oid);
        record.setType(type);
        record.setInfo(info);
        record.setCtime(new Date());
        add(record);


    }

    @Override
    public Result selectAll() {
        return Result.success(recordDao.findAll());
    }
}

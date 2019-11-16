package com.qfedu.service.impl;

import com.qfedu.dao.EvaluateDao;
import com.qfedu.dao.OrderDao;
import com.qfedu.entity.Evaluate;
import com.qfedu.entity.Order;
import com.qfedu.service.EvaluateService;
import com.qfedu.service.OrderService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:34
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public Result add(Order order) {
        if (orderDao.save(order) != null) {
            return Result.success();
        }
        return Result.fail();
    }

    @Override
    public Result selectAll() {
        return Result.success(orderDao.findAll());
    }
}

package com.qfedu.task;

import com.qfedu.dao.EvaluateDao;
import com.qfedu.dao.OrderDao;
import com.qfedu.entity.Evaluate;
import com.qfedu.entity.Order;
import com.qfedu.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 21:22
 */
@Component
public class EvaluateTask {
    @Autowired
    private EvaluateDao evaluateDao;
    @Autowired
    private OrderDao orderDao;

    //7天默认好评 每天执行一次
    @Scheduled(cron = "0 0 0 * * ?")
    public void defaultComment() {
        String d = DateUtil.getTime(-7);
        List<Order> orderList = orderDao.getByTime(d);
        List<Evaluate> evaluates = new ArrayList<>(orderList.size());
        for (Order order : orderList) {
            Evaluate evaluate = new Evaluate();
            evaluate.setComment("好评");
            evaluate.setId(order.getId());
            evaluate.setScore(100);
            evaluate.setType("好评");
            evaluates.add(evaluate);
        }
        evaluateDao.saveAll(evaluates);

    }


}

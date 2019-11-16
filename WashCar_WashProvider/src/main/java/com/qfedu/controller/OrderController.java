package com.qfedu.controller;

import com.qfedu.entity.Order;
import com.qfedu.service.OrderService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 14:21
 */
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/provider/order/add")
    public Result add(@RequestBody  Order order){
        return orderService.add(order);
    }

    @GetMapping("/provider/order/all")
    public Result selectAll(){
        return orderService.selectAll();
    }
}

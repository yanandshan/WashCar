package com.qfedu.web;

import com.qfedu.entity.Appointment;
import com.qfedu.entity.Order;
import com.qfedu.service.ApiAppointmentService;
import com.qfedu.service.OrderService;
import com.qfedu.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 22:17
 */
@Api(value = "订单操作", tags = "订单操作")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ApiOperation(value = "新增订单", notes = "新增订单")
    @PostMapping("/washapi/order/add.do")//新增
    public Result add(@RequestBody Order order) {
        return orderService.add(order);
    }

    @ApiOperation(value = "查询所有的订单", notes = "查询所有的订单")
    @GetMapping("/washapi/order/all.do")//查询
    public Result all() {
        return orderService.selectAll();
    }




}

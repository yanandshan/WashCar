package com.qfedu.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.qfedu.entity.Appointment;
import com.qfedu.service.AppointmentService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:32
 */
@RestController
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/provider/appointment/add")//新增洗车记录
    @HystrixCommand(fallbackMethod = "saveFailBack")
    public Result add(@RequestBody Appointment appointment) {
        System.out.println(10/0);
        return appointmentService.add(appointment);
    }

    //降级方法
    public Result saveFailBack(@RequestBody Appointment appointment){
        System.out.println("调用了降级方法!");
        return Result.fail("服务繁忙！");
    }
    @GetMapping("/provider/appointment/all")
    public Result selectAll() {
        return appointmentService.selectAll();
    }
}

package com.qfedu.service;

import com.qfedu.entity.Appointment;
import com.qfedu.vo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 22:18
 */
@FeignClient(value = "AppointmentProvider")
public interface ApiAppointmentService {

    @PostMapping("/provider/appointment/add")
//新增洗车记录
    Result add(@RequestBody Appointment appointment);

    @GetMapping("/provider/appointment/all")
    Result selectAll();
}

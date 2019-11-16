package com.qfedu.service;

import com.qfedu.entity.Appointment;
import com.qfedu.entity.Evaluate;
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
public interface EvaluateService {
    @PostMapping("/provider/evaluate/add")//增加评价
    Result add(@RequestBody Evaluate evaluate);

    @GetMapping("/provider/evaluate/all")//查看所有评价
     Result selectAll();
}

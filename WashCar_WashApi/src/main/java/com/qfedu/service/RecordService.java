package com.qfedu.service;

import com.qfedu.entity.Order;
import com.qfedu.entity.Record;
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
//@FeignClient(value = "AppointmentProvider")
//public interface RecordService {
//    @GetMapping("/provider/record/all")
//    public Result selectAll();
//
//}

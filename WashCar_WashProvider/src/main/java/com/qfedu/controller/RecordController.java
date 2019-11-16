package com.qfedu.controller;

import com.qfedu.entity.Order;
import com.qfedu.entity.Record;
import com.qfedu.service.OrderService;
import com.qfedu.service.RecordService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 14:22
 */
@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    @GetMapping("/provider/record/all")
    public Result selectAll(){
        return recordService.selectAll();
    }
}

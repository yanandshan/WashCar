package com.qfedu.web;

import com.qfedu.entity.Appointment;
import com.qfedu.entity.Evaluate;
import com.qfedu.service.ApiAppointmentService;
import com.qfedu.service.EvaluateService;
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

@Api(value = "评价操作",tags = "评价操作")
@RestController
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @ApiOperation(value = "增加评价", notes = "增加评价")
    @PostMapping("/washapi/evaluate/add.do")
    public Result add(@RequestBody Evaluate evaluate) {

        return evaluateService.add(evaluate);
    }

    @ApiOperation(value = "查看所有评价", notes = "查看所有评价")
    @GetMapping("/washapi/evaluate/all.do")
    public Result all() {
        return evaluateService.selectAll();
    }

}

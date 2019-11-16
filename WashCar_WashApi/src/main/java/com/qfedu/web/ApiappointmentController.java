package com.qfedu.web;

import com.qfedu.entity.Appointment;
import com.qfedu.service.ApiAppointmentService;
import com.qfedu.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 22:17
 */
@Api(value = "预约操作",tags = "预约操作")
@RestController
public class ApiappointmentController {
    @Autowired

    private ApiAppointmentService apiAppointmentService;

    @ApiOperation(value = "新增预约", notes = "新增预约")
    @PostMapping("/washapi/appointment/add.do")//新增
    public Result add(@RequestBody Appointment appointment) {
        return Result.success(apiAppointmentService.add(appointment));
    }

    @ApiOperation(value = "查询所有的预约信息", notes = "查询所有的预约信息")
    @GetMapping("/washapi/appointment/all.do")//查询
    public Result all() {
        return apiAppointmentService.selectAll();
    }


}

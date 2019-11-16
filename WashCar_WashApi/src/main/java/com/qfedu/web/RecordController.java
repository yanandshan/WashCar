package com.qfedu.web;

import com.qfedu.entity.Order;
import com.qfedu.entity.Record;
import com.qfedu.service.OrderService;
import com.qfedu.ribbon.RecordService;
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
@Api(value = "日志相关操作", tags = "日志相关操作")
@RestController
public class RecordController {
    @Autowired
    private RecordService recordService;

    @ApiOperation(value = "查询所有日志", notes = "查询所有日志")
    @GetMapping("/washapi/record/all.do")//查询
    public Result all() {
        return recordService.select();
    }


}

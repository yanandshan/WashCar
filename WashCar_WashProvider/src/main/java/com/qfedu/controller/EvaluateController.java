package com.qfedu.controller;

import com.qfedu.entity.Evaluate;
import com.qfedu.service.EvaluateService;
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
public class EvaluateController {
    @Autowired
    private EvaluateService evaluateService;

    @PostMapping("/provider/evaluate/add")//增加评价
    public Result add(@RequestBody Evaluate evaluate) {

        return evaluateService.add(evaluate);
    }
    @GetMapping("/provider/evaluate/all")//查看所有评价
    public Result selectAll(){
        return evaluateService.selectAll();
    }
}

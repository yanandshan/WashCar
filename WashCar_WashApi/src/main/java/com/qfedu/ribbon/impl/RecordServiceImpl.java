package com.qfedu.ribbon.impl;


import com.qfedu.ribbon.RecordService;
import com.qfedu.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Result select() {
        //Get请求
//        restTemplate.getForObject("路径","结果的Class对象")
        //Post请求
//        restTemplate.postForObject();
        //Put请求
//        restTemplate.put();
        //Delete请求
//        restTemplate.delete();
        return restTemplate.getForObject("http://AppointmentProvider/provider/record/all",Result.class);
    }
}

package com.qfedu.ribbon;


import com.qfedu.vo.Result;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(value = "AppointmentProvider")
public interface RecordService {
    Result select();
}

package com.qfedu.service;

import com.qfedu.entity.Appointment;
import com.qfedu.vo.Result;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:33
 */
public interface AppointmentService {

    Result add(Appointment appointment);

    Result selectAll();

}

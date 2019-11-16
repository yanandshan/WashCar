package com.qfedu.dao;

import com.qfedu.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:33
 */

public interface AppointmentDao extends JpaRepository<Appointment,Integer> {
}

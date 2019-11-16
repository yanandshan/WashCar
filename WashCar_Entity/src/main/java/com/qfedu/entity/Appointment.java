package com.qfedu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 20:21
 */
@Data
@Entity //标记这是映射类 这个类对应有表
@Table(name = "appointment")
public class Appointment {
    @Id //标记这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略  自增 Mysql
    private Integer id;
    @Column(length = 30)
    private String type;
    @Column(length = 30)
    private String shop_name;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date appointment_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date arrival_time;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date create_time;
    @Column(length = 30)
    private String appointment_code;
    @Column(length = 30)
    private String car_owner_name;
    @Column(length = 30)
    private String contact_type;
    @Column(length = 30)
    private String car_licence;

}

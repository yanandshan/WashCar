package com.qfedu.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 20:45
 */
@Data
@Entity //标记这是映射类 这个类对应有表
@Table(name = "record")
public class Record {
    @Id//标记这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略  自增 Mysql
    private Integer id;
    private Integer oid;
    @Column(length = 35)
    private String type;
    private String info;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date ctime;
}

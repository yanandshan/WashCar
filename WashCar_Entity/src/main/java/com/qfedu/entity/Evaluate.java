package com.qfedu.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 20:43
 */
@Data
@Entity //标记这是映射类 这个类对应有表
@Table(name = "evaluate")
public class Evaluate {
    @Id //标记这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略  自增 Mysql
    private Integer id;
    private Integer orderId;
    @Column(length = 35)
    private String type;
    private Integer score;
    @Column(length = 254)
    private String comment;
}

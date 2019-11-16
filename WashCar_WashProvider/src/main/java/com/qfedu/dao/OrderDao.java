package com.qfedu.dao;

import com.qfedu.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 15:22
 */

public interface OrderDao extends JpaRepository<Order,Integer> {
    List<Order> getByTime(String time);
}

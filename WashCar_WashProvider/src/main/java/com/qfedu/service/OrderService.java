package com.qfedu.service;

import com.qfedu.entity.Order;
import com.qfedu.vo.Result;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 15:19
 */
public interface OrderService {
    Result add(Order order);

    Result selectAll();

}

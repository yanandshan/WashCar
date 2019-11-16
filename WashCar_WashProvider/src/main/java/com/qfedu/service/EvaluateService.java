package com.qfedu.service;

import com.qfedu.entity.Evaluate;
import com.qfedu.vo.Result;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 14:29
 */
public interface EvaluateService {
    Result add(Evaluate evaluate);

    Result selectAll();

}

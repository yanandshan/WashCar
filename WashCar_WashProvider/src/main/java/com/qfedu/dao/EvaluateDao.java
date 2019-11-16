package com.qfedu.dao;

import com.qfedu.entity.Evaluate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 14:38
 */
@Repository
public interface EvaluateDao extends JpaRepository<Evaluate,Integer> {
}

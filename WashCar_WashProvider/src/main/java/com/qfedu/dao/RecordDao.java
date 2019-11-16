package com.qfedu.dao;

import com.qfedu.entity.Record;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 19:16
 */
public interface RecordDao extends JpaRepository<Record,Integer> {
}

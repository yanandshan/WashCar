package com.qfedu.service;

import com.qfedu.entity.Record;
import com.qfedu.vo.Result;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 19:14
 */
public interface RecordService {
    void add(Record record);

    void saveLog(int oid,String type,String info);
    Result selectAll();
}

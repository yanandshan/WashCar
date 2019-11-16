package com.qfedu.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 21:06
 */
@Component
public class HelloTask {
    @Scheduled(cron = "5/5 * 16 * * ?")
    public void spleak() {
        System.out.println("重要的事情:" + System.currentTimeMillis() / 1000);
    }

    //每分钟执行一次
    @Scheduled(cron = "0 * * * * ?")
    public void pingjia() {
        System.out.println("重要的事情：" + System.currentTimeMillis() / 1000);
        //查询这个分钟 应该默认好评的订单 7天
        //7天 前 16:58分 16:00-
    }
}

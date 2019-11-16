package com.qfedu.config;

import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/7 18:16
 */

/**
 * 解决超时问题，增长超时时间。
 */
@Configuration
public class FeignConfig {
    public int connectTime = 10000;
    public int readTime = 10000;

    @Bean
    public Request.Options createOP() {
        return new Request.Options(connectTime, readTime);
    }
}

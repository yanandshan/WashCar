package com.qfedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 21:27
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker//启用Hystrix并开启监控
@EntityScan(basePackages = "com.qfedu.entity")
public class WashProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(WashProviderApplication.class,args);
    }
}

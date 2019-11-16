package com.qfedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Administrator
 * @version 1.0
 * @date 2019/11/6 20:08
 */
@SpringBootApplication
@EnableEurekaServer
public class ApplicationEurekaServer {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationEurekaServer.class,args);
    }
}


package com.qfedu.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: WashCar
 * @description:
 * @author: Feri
 * @create: 2019-11-07 17:59
 */
@Configuration
public class RabbitMQConfig {

    @Bean
    public Queue createQueue() {
        return new Queue(RabbitMQQueueConfig.YUYUE_QUEUE);
    }
    //
    /*@Bean
    public RabbitTemplate createRT(){
        return new RabbitTemplate();
    }*/
}

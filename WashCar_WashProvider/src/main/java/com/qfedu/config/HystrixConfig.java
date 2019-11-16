package com.qfedu.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//添加Servlet
//        HystrixMetricsStreamServlet 对象设置到Servlet注册器中
//        监控服务运行状态
@Configuration
public class HystrixConfig {
    @Bean
    public ServletRegistrationBean createSRB(){
        ServletRegistrationBean registrationBean=new ServletRegistrationBean();
        registrationBean.setServlet(new HystrixMetricsStreamServlet());
        registrationBean.addUrlMappings("/hystrix.stream");
        return registrationBean;
    }
}

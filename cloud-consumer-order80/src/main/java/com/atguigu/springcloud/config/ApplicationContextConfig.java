package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.config
 * @ClassName ApplicationContextConfig
 * @Author ZCC
 * @Date 2022/03/02
 * @Description TODO
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    // @LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}

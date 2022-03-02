package com.atguigu.springcloud.config;

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

    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}

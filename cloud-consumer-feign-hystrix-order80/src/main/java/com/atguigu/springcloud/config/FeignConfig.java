package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.com.atguigu.springcloud.config
 * @ClassName FeignConfig
 * @Author ZCC
 * @Date 2022/06/16
 * @Description openFegin日志配置
 * @Version 1.0
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level getLogLevel(){
        return Logger.Level.FULL;
    }
}

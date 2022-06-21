package com.atguigu.springcoud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcoud
 * @ClassName ConfigClient3355
 * @Author ZCC
 * @Date 2022/06/20
 * @Description TODO
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient3355 {
    public static void main(String[] args) {

        SpringApplication.run(ConfigClient3355.class,args);
    }
}

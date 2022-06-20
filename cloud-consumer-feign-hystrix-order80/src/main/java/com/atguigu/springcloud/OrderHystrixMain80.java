package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud
 * @ClassName OrderHystrixMain80
 * @Author ZCC
 * @Date 2022/03/07
 * @Description TODO
 * @Version 1.0
 */
@EnableHystrix
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class OrderHystrixMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain80.class, args);
    }
}


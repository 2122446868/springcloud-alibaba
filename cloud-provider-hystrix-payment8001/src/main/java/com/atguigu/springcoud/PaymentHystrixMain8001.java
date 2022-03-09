package com.atguigu.springcoud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcoud
 * @ClassName PaymentHystrixMain8001
 * @Author ZCC
 * @Date 2022/03/07
 * @Description TODO
 * @Version 1.0
 */
@EnableCircuitBreaker
@SpringBootApplication
public class PaymentHystrixMain8001 {
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentHystrixMain8001.class,args);
    }
}
package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud
 * @ClassName PaymentApp9001
 * @Author ZCC
 * @Date 2022/06/21
 * @Description TODO
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentApp9001 {
    public static void main(String[] args) {


        SpringApplication.run(PaymentApp9001.class, args);
    }
}

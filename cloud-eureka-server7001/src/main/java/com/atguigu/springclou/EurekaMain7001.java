package com.atguigu.springclou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springclou
 * @ClassName EurekaMain7001
 * @Author ZCC
 * @Date 2022/03/02
 * @Description TODO
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}

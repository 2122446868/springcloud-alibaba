package com.arguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName springcloud
 * @Package com.arguigu.springcloud
 * @ClassName ConfigNacosApp3377
 * @Author ZCC
 * @Date 2022/06/21
 * @Description TODO
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigNacosApp3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosApp3377.class, args);
    }
}

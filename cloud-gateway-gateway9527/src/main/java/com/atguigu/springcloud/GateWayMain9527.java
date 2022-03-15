package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud
 * @ClassName GateWayMain9527
 * @Author ZCC
 * @Date 2022/03/15
 * @Description TODO
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527
{
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayMain9527.class,args);
    }
}

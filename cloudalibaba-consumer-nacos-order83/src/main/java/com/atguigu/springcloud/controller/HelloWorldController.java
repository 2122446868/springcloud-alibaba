package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.controller
 * @ClassName HelloWorldController
 * @Author ZCC
 * @Date 2022/06/21
 * @Description TODO
 * @Version 1.0
 */
@RestController
public class HelloWorldController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-uri.nacos-use-service}")
    private  String url;
    @GetMapping("/consumer/payment/nacos/{id}")
    public String pyamentInfo(@PathVariable("id") String id){

       return restTemplate.getForObject(url+"/echo/"+id,String.class);
    }
}

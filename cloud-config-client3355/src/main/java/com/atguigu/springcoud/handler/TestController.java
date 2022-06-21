package com.atguigu.springcoud.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcoud.controller
 * @ClassName TestController
 * @Author ZCC
 * @Date 2022/06/20
 * @Description TODO
 * @Version 1.0
 */
@RestController
@RefreshScope
public class TestController {

    @Value("${config.info}")
    private String value;

    @GetMapping("/getValue")
    public String getValue() {
        return value;

    }
}

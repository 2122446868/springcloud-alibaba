package com.arguigu.springcloud.controler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName springcloud
 * @Package com.arguigu.springcloud.controler
 * @ClassName HelloWorldController
 * @Author ZCC
 * @Date 2022/06/21
 * @Description TODO
 * @Version 1.0
 */
@RefreshScope
@RestController
public class HelloWorldController {

    @Value("${config.info}")
    private String value;

    @GetMapping("/config/getConfigInfoValue")
    public String getConfigInfoValue() {
        return value;

    }
}

package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.controller
 * @ClassName EchoController
 * @Author ZCC
 * @Date 2022/06/21
 * @Description TODO
 * @Version 1.0
 */
@RestController
public class EchoController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return string;
    }
}

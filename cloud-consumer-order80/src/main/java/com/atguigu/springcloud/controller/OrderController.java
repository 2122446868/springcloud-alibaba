package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.controller
 * @ClassName OrderController
 * @Author ZCC
 * @Date 2022/03/02
 * @Description TODO
 * @Version 1.0
 */
@Slf4j
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    private static final String PREFIX_PAY_URL = "http://localhost:8001";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PREFIX_PAY_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
       return restTemplate.getForObject(PREFIX_PAY_URL+"/payment/get/"+id,CommonResult.class,id);
    }
}

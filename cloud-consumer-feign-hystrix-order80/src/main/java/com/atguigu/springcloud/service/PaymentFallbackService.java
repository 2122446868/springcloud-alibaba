package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.service
 * @ClassName PaymentFallbackService
 * @Author ZCC
 * @Date 2022/03/09
 * @Description TODO
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";
    }
}

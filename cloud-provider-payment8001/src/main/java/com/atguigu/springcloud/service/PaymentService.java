package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.service
 * @ClassName PaymentService
 * @Author ZCC
 * @Date 2022/03/01
 * @Description TODO
 * @Version 1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}

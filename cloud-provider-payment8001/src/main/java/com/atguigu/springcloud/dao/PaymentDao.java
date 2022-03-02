package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.dao
 * @ClassName PaymentDao
 * @Author ZCC
 * @Date 2022/03/01
 * @Description TODO
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}

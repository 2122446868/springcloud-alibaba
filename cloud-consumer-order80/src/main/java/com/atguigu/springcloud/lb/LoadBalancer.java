package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.lb
 * @ClassName LoadBalancer
 * @Author ZCC
 * @Date 2022/03/07
 * @Description 自定义ribbon负载均衡算法组（轮询）
 * @Version 1.0
 */
public interface LoadBalancer {

    ServiceInstance intance(List<ServiceInstance> allService);
}

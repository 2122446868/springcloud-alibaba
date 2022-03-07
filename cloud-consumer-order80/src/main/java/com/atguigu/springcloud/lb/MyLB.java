package com.atguigu.springcloud.lb;

import javafx.beans.binding.When;
import jdk.nashorn.internal.objects.annotations.Where;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.lb
 * @ClassName MyLB
 * @Author ZCC
 * @Date 2022/03/07
 * @Description 自定义ribbon负载均衡算法组（轮询）
 * @Version 1.0
 */
@Slf4j
@Component
public class MyLB implements LoadBalancer {
    //记录服务器访问总次数
    private AtomicInteger count =new AtomicInteger(0);

    public final int getAndIncrement() {
        int current;
        int next;
        current=this.count.get();
        next=current>=Integer.MAX_VALUE?0:current+1;
        do {

        } while (!this.count.compareAndSet(current,next));
        log.info("第几次访问："+next);
        return next;

    }

    /**
     * @title intance
     * @description  负载均衡算法：rest接口第几次请求数 % 服务器集群总数量 = 实际调用服务器位置下标  ，每次服务重启动后rest接口计数从1开始。
     * @author zcc 
     * @param: allService
     * @date 2022/3/7 10:40 
     * @return: org.springframework.cloud.client.ServiceInstance
     * @throws 
     */
    @Override
    public ServiceInstance intance(List<ServiceInstance> allService) {
        int index=getAndIncrement()%allService.size();
        return allService.get(index);
    }
}

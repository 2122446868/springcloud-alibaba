package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.myrule
 * @ClassName MySelfRule
 * @Author ZCC
 * @Date 2022/03/04
 * @Description ribbon 负载均衡 算法替换
 * @Version 1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}

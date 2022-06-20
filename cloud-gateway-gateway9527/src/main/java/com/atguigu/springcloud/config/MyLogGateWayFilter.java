package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcloud.config
 * @ClassName MyLogGateWayFilter
 * @Author ZCC
 * @Date 2022/03/16
 * @Description TODO
 * @Version 1.0
 */
@Component
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        System.out.println("time:"+new Date()+"\t 执行了自定义的全局过滤器: "+"MyLogGateWayFilter"+"hello");

        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if (uname == null) {
            System.out.println("****用户名为null，无法登录");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);

    }

    /**
     * @throws
     * @title getOrder
     * @description 执行顺序
     * @author zcc
     * @date 2022/3/16 11:34
     * @return: int
     */
    @Override
    public int getOrder() {
        return 0;
    }
}

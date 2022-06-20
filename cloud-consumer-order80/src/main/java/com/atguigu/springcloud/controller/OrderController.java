package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.lb.LoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;
import java.util.function.ObjIntConsumer;

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

    @Resource
    private DiscoveryClient discoveryClient;

    // @Resource
    // private LoadBalancer loadBalancer;

    // private static final String PREFIX_PAY_URL = "http://localhost:8001";
    private static final String PREFIX_PAY_URL = "http://cloud-payment-service";

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PREFIX_PAY_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PREFIX_PAY_URL + "/payment/get/" + id, CommonResult.class, id);
    }

    @GetMapping("/getDiscovery")
    public Object getDiscovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*****service：" + service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info("name:" + instance.getScheme() + "\t" + "host：" + instance.getHost() + "\t" + "port：" + instance.getPort() + "\t" + "InstanceId：" + instance.getInstanceId()+"\t" + "serverId：" + instance.getServiceId()+"\t"+"url："+instance.getUri());

        }

        return discoveryClient;
    }

    // @GetMapping("/consumer/payment/lb")
    // public String getPaymentLB(){
    //     List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
    //     if (instances==null&&instances.size()<=0){
    //         return null;
    //     }
    //
    //     // ServiceInstance intance = loadBalancer.intance(instances);
    //     // URI uri = intance.getUri();
    //     // return restTemplate.getForObject(uri+"/payment/lb",String.class);
    //
    // }
}

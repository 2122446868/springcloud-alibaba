package springcoud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ProjectName springcloud
 * @Package com.atguigu.springcoud
 * @ClassName ConfigClient3355
 * @Author ZCC
 * @Date 2022/06/20
 * @Description TODO
 * @Version 1.0
 */

@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient3366 {
    public static void main(String[] args) {

        SpringApplication.run(ConfigClient3366.class,args);
    }
}

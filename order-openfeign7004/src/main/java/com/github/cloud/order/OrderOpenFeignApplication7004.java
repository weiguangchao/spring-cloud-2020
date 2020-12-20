package com.github.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author weiguangchao
 * @date 2020/12/16
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class OrderOpenFeignApplication7004 {

    public static void main(String[] args) {
        SpringApplication.run(OrderOpenFeignApplication7004.class, args);
    }
}

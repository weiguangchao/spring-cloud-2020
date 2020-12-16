package com.github.cloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author weiguangchao
 * @date 2020/12/16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication7002.class, args);
    }
}

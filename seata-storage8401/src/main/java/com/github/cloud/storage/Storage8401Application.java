package com.github.cloud.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author weiguangchao
 * @date 2020/12/28
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class Storage8401Application {

    public static void main(String[] args) {
        SpringApplication.run(Storage8401Application.class, args);
    }
}

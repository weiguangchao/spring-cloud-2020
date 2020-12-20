package com.github.cloud.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weiguangchao
 * @date 2020/12/16
 */
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
public class AddressHystrixApplication8004 {

    public static void main(String[] args) {
        SpringApplication.run(AddressHystrixApplication8004.class, args);
    }
}

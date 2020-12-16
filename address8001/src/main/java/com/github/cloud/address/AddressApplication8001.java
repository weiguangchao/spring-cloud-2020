package com.github.cloud.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weiguangchao
 * @date 2020/12/15
 */
@EnableEurekaClient
@SpringBootApplication
public class AddressApplication8001 {

    public static void main(String[] args) {
        SpringApplication.run(AddressApplication8001.class, args);
    }
}

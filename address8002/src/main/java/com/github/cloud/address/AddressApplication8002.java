package com.github.cloud.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author weiguangchao
 * @date 2020/12/15
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AddressApplication8002 {

    public static void main(String[] args) {
        SpringApplication.run(AddressApplication8002.class, args);
    }
}

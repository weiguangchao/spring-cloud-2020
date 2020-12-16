package com.github.cloud.eureke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author weiguangchao
 * @date 2020/12/15
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka3002Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3002Application.class, args);
    }
}

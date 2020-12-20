package com.github.cloud.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author weiguangchao
 * @date 2020/12/20
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamProvider8410Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamProvider8410Application.class, args);
    }
}

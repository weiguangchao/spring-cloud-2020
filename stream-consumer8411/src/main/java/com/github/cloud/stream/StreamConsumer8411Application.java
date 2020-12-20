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
public class StreamConsumer8411Application {

    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer8411Application.class, args);
    }
}

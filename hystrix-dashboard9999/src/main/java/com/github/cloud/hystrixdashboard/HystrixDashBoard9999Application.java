package com.github.cloud.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author weiguangchao
 * @date 2020/12/19
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashBoard9999Application {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoard9999Application.class, args);
    }
}

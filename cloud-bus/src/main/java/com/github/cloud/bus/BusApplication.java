package com.github.cloud.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

/**
 * @author weiguangchao
 * @date 2021/4/2
 */
@SpringBootApplication
@RemoteApplicationEventScan
public class BusApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusApplication.class);
    }
}

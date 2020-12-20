package com.github.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author weiguangchao
 * @date 2020/12/19
 */
@EnableConfigServer
@SpringBootApplication
public class Config9898Application {

    public static void main(String[] args) {
        SpringApplication.run(Config9898Application.class, args);
    }
}

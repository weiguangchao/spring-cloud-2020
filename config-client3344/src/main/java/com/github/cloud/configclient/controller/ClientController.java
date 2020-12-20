package com.github.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiguangchao
 * @date 2020/12/19
 */
@RefreshScope
@RestController
public class ClientController {

    @Value(("${app-config.name:config-client}"))
    private String appName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String index() {
        return this.port + " ->> " + this.appName;
    }
}

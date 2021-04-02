package com.github.cloud.address.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiguangchao
 * @date 2020/12/23
 */
@RestController
public class AddressController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressController.class);

    @GetMapping("/hello")
    public String hello() {
        String msg = "Hello Sentinel";
        LOGGER.info(msg);
        return msg;
    }
}

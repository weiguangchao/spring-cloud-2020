package com.github.cloud.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cloud.stream.service.OrderProvider;

/**
 * @author weiguangchao
 * @date 2020/12/20
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderProvider orderProvider;

    @GetMapping("/send")
    public String send() {
        orderProvider.sendMessage();
        return "发送成功";
    }
}

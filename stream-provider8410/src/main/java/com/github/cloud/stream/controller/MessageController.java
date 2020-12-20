package com.github.cloud.stream.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cloud.stream.service.MessageProvider;

/**
 * @author weiguangchao
 * @date 2020/12/20
 */
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageProvider messageProvider;

    @GetMapping("/send")
    public void send() {
        messageProvider.sendMessage();
    }
}

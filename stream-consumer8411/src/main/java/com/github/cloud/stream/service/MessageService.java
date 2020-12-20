package com.github.cloud.stream.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * 消息接受者.
 *
 * @author weiguangchao
 * @date 2020/12/20
 */
@Component
@EnableBinding(Sink.class)
public class MessageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageService.class);

    @StreamListener(Sink.INPUT)
    public void receive(String message) {
        LOGGER.info("message = " + message);
    }
}

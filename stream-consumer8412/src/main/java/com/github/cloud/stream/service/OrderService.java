package com.github.cloud.stream.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import com.github.cloud.stream.message.OrderSink;

/**
 * @author weiguangchao
 * @date 2020/12/20
 */
@Component
@EnableBinding(OrderSink.class)
public class OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

    @StreamListener(OrderSink.INPUT)
    public void consume(String message) {
        LOGGER.info("message = " + message);
    }
}

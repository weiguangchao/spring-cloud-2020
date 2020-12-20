package com.github.cloud.stream.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import com.github.cloud.stream.message.OrderSource;

import cn.hutool.core.util.IdUtil;

/**
 * @author weiguangchao
 * @date 2020/12/20
 */
@Component
@EnableBinding(OrderSource.class)
public class OrderProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderProvider.class);

    @Autowired
    private OrderSource orderSource;

    public void sendMessage() {
        String message = IdUtil.simpleUUID();
        LOGGER.info("order = " + message);
        this.orderSource.output().send(new GenericMessage<>(message));
    }
}


package com.github.cloud.stream.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

import cn.hutool.core.util.IdUtil;

/**
 * 消息生产者.
 *
 * @author weiguangchao
 * @date 2020/12/20
 */
@Component
@EnableBinding(Source.class)
public class MessageProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProvider.class);

    @Autowired
    private Source source;

    public void sendMessage() {
        String message = IdUtil.simpleUUID();
        LOGGER.info("message = " + message);
        this.source.output().send(new GenericMessage<>(message));
    }
}

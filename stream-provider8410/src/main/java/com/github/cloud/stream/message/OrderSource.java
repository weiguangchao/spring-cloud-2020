package com.github.cloud.stream.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * 自定义消息发送通道.
 *
 * @see org.springframework.cloud.stream.messaging.Source
 * @author weiguangchao
 * @date 2020/12/20
 */
public interface OrderSource {

    /**
     * Name of the output channel.
     */
    String OUTPUT = "order_output";

    /**
     * @return output channel
     */
    @Output(OrderSource.OUTPUT)
    MessageChannel output();
}

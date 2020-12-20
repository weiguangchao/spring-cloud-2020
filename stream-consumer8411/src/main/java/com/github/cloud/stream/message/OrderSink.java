package com.github.cloud.stream.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;


/**
 * @see org.springframework.cloud.stream.messaging.Sink
 * @author weiguangchao
 * @date 2020/12/20
 */
public interface OrderSink {

    /**
     * Input channel name.
     */
    String INPUT = "order_input";

    /**
     * @return input channel.
     */
    @Input(OrderSink.INPUT)
    SubscribableChannel input();
}

package com.github.cloud.bus.event;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * @author weiguangchao
 * @date 2021/4/2
 */
public class MyEvent extends RemoteApplicationEvent {

    public MyEvent() {
    }

    public MyEvent(Object source, String originService, String destinationService) {
        super(source, originService, destinationService);
    }
}

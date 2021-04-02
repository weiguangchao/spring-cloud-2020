package com.github.cloud.bus.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.github.cloud.bus.event.MyEvent;

/**
 * @author weiguangchao
 * @date 2021/4/2
 */
@Component
public class MyEventListener {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private Integer port;

    @EventListener
    public void onCustomRemoteApplicationEvent(MyEvent event) {
        System.out.printf("MyEventListener >>>>>>>> MyEvent - "
                        + " applicationName : %s , port : %s , Source : %s , originService : %s , destinationService : %s \n",
                applicationName, port, event.getSource(), event.getOriginService(), event.getDestinationService());
    }
}

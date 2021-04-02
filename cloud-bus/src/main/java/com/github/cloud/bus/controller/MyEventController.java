package com.github.cloud.bus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.cloud.bus.event.MyEvent;

/**
 * @author weiguangchao
 * @date 2021/4/2
 */
@RestController
public class MyEventController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private BusProperties busProperties;

    @GetMapping("/bus/event/publish/custom")
    public String publishMyEvent(String msg,
                                 @RequestParam(value = "dest", required = false) String dest) {
        //这里由于我没有定义ID ，这里Spring Cloud Bus 自己默认实现了ID
        String instanceId = busProperties.getId();
        MyEvent event = new MyEvent(msg, instanceId, dest);
        applicationContext.publishEvent(event);
        return "success";
    }
}

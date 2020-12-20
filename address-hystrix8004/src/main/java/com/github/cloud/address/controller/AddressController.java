package com.github.cloud.address.controller;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.github.cloud.common.util.R;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

import cn.hutool.core.util.RandomUtil;

/**
 * @author weiguangchao
 * @date 2020/12/16
 */
@RestController
public class AddressController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressController.class);

    @GetMapping("/ok")
    public R ok() {
        return R.ok().put("data", "山东省烟台市芝罘区");
    }

    @GetMapping("/random_error")
    @HystrixCommand(
            fallbackMethod = "sleep_fallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
                    // 调用超时时间
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 开启断路器
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"), // 触发断路保护窗口大小
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"), // 触发断路保护的出错百分比
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), // 断路后拒绝请求的时间
            }
    )
    public R randomError(Integer flag) {
        int i = RandomUtil.randomInt(0, 5);
        if (i > 4) {
            int l = 10 / 0;
        }
        else {
            try {
                TimeUnit.SECONDS.sleep(i);
            }
            catch (InterruptedException e) {
                LOGGER.warn("中断了::" + e, e);
            }
        }
        return R.ok().put("data", "山东省烟台市莱山区").put("thread", Thread.currentThread().getName());
    }

    @GetMapping("/error/{flag}")
    @HystrixCommand(
            fallbackMethod = "sleep_fallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
                    // 调用超时时间
                    @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), // 开启断路器
                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "20"), // 触发断路保护窗口大小
                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60"), // 触发断路保护的出错百分比
                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000"), // 断路后拒绝请求的时间
            }
    )
    public R error(@PathVariable Integer flag) {
        if (flag == 0) {
            int i = 10 / 0;
        }
        return R.ok().put("data", "山东省烟台市莱山区").put("thread", Thread.currentThread().getName());
    }

    @GetMapping("/sleep/{second}")
    @HystrixCommand(
            fallbackMethod = "sleep_fallback",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
                    // 调用超时时间
            }
    )
    public R sleep(@PathVariable Integer second) {
        LOGGER.debug("AddressController#sleep calling, sleep " + second + "(s)...");
        try {
            TimeUnit.SECONDS.sleep(second);
        }
        catch (InterruptedException e) {
            LOGGER.error("中断了::" + e.getMessage(), e);
        }

        return R.ok().put("data", "山东省烟台市莱山区").put("thread", Thread.currentThread().getName());
    }

    public R sleep_fallback(@PathVariable Integer second) {
        return R.error(444, "服务器繁忙请稍后重试").put("thread", Thread.currentThread().getName());
    }
}

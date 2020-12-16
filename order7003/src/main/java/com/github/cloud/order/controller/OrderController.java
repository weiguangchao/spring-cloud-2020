package com.github.cloud.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.cloud.common.util.R;

/**
 * @author weiguangchao
 * @date 2020/12/15
 */
@RestController
public class OrderController {

    private RestTemplate restTemplate;

    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/pay")
    public R pay() {
        R response = restTemplate.getForObject("http://cloud-address/address/getAddress", R.class);
        String address = (String) response.get("data");
        return R.ok().put("address", address).put("user", "admin");
    }
}

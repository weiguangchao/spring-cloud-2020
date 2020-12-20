package com.github.cloud.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.github.cloud.common.util.R;
import com.github.cloud.order.feign.AddressRestClient;

/**
 * @author weiguangchao
 * @date 2020/12/15
 */
@RestController
public class OrderController {

    private AddressRestClient addressRestClient;

    public OrderController(AddressRestClient addressRestClient) {
        this.addressRestClient = addressRestClient;
    }

    @GetMapping("/pay")
    public R pay() {
        R response = addressRestClient.getAddress();
        String address = (String) response.get("data");
        return R.ok().put("address", address).put("user", "admin");
    }
}

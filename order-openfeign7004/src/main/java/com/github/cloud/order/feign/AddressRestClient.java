package com.github.cloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.github.cloud.common.util.R;

/**
 * @author weiguangchao
 * @date 2020/12/16
 */
@FeignClient("cloud-address")
public interface AddressRestClient {

    @GetMapping("/address/getAddress")
    R getAddress();
}

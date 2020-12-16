package com.github.cloud.address.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cloud.common.util.R;

/**
 * @author weiguangchao
 * @date 2020/12/15
 */
@RestController
public class AddressController {

    @GetMapping("/getAddress")
    public R getAddress() {
        return R.ok().put("data", "山东省烟台市芝罘区");
    }
}

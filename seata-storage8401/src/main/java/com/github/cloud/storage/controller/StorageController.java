package com.github.cloud.storage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.cloud.common.util.R;
import com.github.cloud.storage.service.StorageService;

/**
 * @author weiguangchao
 * @date 2020/12/28
 */
@RestController
public class StorageController {

    private StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping(path = "/deduct")
    public R deduct(String commodityCode, Integer count) {
        storageService.deduct(commodityCode, count);
        return R.ok();
    }
}

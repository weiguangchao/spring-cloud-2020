package com.github.cloud.storage.service;

/**
 * @author weiguangchao
 * @date 2020/12/28
 */
public interface StorageService {

    /**
     * 扣除存储数量
     */
    void deduct(String commodityCode, int count);
}

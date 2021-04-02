package com.github.cloud.storage.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.cloud.storage.entity.StorageDO;
import com.github.cloud.storage.repository.StorageDAO;
import com.github.cloud.storage.service.StorageService;

/**
 * @author weiguangchao
 * @date 2020/12/28
 */
@Service
public class StorageServiceImpl implements StorageService {

    private StorageDAO storageDAO;

    public StorageServiceImpl(StorageDAO storageDAO) {
        this.storageDAO = storageDAO;
    }

    @Transactional
    @Override
    public void deduct(String commodityCode, int count) {
        StorageDO storage = storageDAO.findByCommodityCode(commodityCode);
        storage.setCount(storage.getCount() - count);

        storageDAO.save(storage);
    }
}

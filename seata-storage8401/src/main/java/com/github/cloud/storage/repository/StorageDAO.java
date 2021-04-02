package com.github.cloud.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.cloud.storage.entity.StorageDO;

/**
 * @author weiguangchao
 * @date 2020/12/28
 */
@Repository
public interface StorageDAO extends JpaRepository<StorageDO, Long> {

    StorageDO findByCommodityCode(String commodityCode);
}

package com.github.cloud.storage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

/**
 * @author weiguangchao
 * @date 2020/12/28
 */
@Data
@Entity
@Table(name = "storage_tbl")
@DynamicUpdate
@DynamicInsert
public class StorageDO {
    @Id
    private Long id;
    private String commodityCode;
    private Integer count;
}

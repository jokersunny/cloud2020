package com.atguigu.springcloud.alibaba.service;


public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Integer productId, Integer count);
}

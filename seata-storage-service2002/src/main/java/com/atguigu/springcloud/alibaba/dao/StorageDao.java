package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {

    //扣减库存
    void decrease(@Param("productId") Integer productId, @Param("count") Integer count);
}

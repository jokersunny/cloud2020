package com.atguigu.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther zzyy
 * @create 2020-02-26 15:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order
{
    private Integer id;

    private Integer userId;

    private Integer productId;

    private Integer count;

    private Integer money;

    private Integer status; //订单状态：0：创建中；1：已完结
}

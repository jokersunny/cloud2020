package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 *
 * @auther zzyy
 * @create 2020-02-20 18:22
 */
@Component
//这种处理方法只有针对feign找不到提供方才会起效果，异常什么的还是hystrix起效果，如果配置了这个和hystrix，找不到提供方，优先被feign处理
//它的运行逻辑是:
//        当请求过来,首先还是通过Feign远程调用pay模块对应的方法
//        但是如果pay模块报错,调用失败,那么就会调用PayMentFalbackService类的
//        当前同名的方法,作为降级方法
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}

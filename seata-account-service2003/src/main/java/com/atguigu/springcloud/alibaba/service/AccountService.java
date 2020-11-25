package com.atguigu.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;


public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@RequestParam("userId") Integer userId, @RequestParam("money") Integer money);
}

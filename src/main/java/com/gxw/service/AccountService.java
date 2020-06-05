package com.gxw.service;

import com.gxw.pojo.Account;

import java.util.List;

/**
 * @author GXW工作室
 * @date 2020/6/5 0005 - 00:56
 */
public interface AccountService {
    //查询账户信息,同时查询出账号下的用户信息
    List<Account> findAll();
}


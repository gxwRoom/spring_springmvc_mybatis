package com.gxw.service.impl;

import com.gxw.mapper.AccountMapper;
import com.gxw.pojo.Account;
import com.gxw.service.AccountService;
import org.apache.ibatis.annotations.Param;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author GXW工作室
 * @date 2020/6/5 0005 - 00:57
 */
@Aspect
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    //查询
    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}

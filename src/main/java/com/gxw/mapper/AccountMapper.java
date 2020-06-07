package com.gxw.mapper;

import com.gxw.pojo.Account;
import javax.annotation.Resource;
import java.util.List;

/**
 * 账号映射接口
 * @author GXW工作室
 * @date 2020/6/2 0002 - 11:04
 */
@Resource
public interface AccountMapper {

    //查询账户信息,同时查询出账号下的用户信息
    List<Account> findAll();
}

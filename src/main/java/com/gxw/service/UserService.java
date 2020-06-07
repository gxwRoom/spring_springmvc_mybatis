package com.gxw.service;

import com.gxw.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author GXW工作室
 * @date 2020/6/5 0005 - 00:56
 */
public interface UserService {
    //查询全部
    List<User> selectUser(String username);

    //根据id查询用户对象
    User findUserById(Integer id);

    //根据名称模糊查询
    List<User> findUserByName(String username);

    //分页查询用户信息
    List<User> findUserPage(Map<String,Object> map);

    //查询总数
    int findTotal();

    //添加数据
    int addUser(User user);

    //更新用户
    int updateUser(User user);

    //根据id删除用户
    int deleteUserById(Integer id);

    //实现一对多关联查询，查询用户信息，同时查询出用户的账号信息
    List<User> findUserAndAccount();
}

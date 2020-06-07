package com.gxw;
import com.gxw.pojo.User;
import com.gxw.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 单元测试类
 * @author GXW工作室
 * @date 2020/6/5 0005 - 23:12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class SSMServiceTest {
    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        String[] names = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
        System.out.println("单元测试类......");
    }

    /**
     * 1.查询所有测试
     */
    @Test
    public void findUserTest(String username){
        List<User> findAll = userService.selectUser(username);
        System.out.println("---->查询所有用户信息："+findAll);
    }

    /**
     * 2.分页查询测试
     */
    @Test
    public void findUserPageTest(){
        int pageSize=2;
        int pageNumber=2;
        Map<String,Object> map = new HashMap<>();
        map.put("pageSize",pageSize);
        map.put("pageStart",pageSize*(pageNumber-1));
        List<User> userPage = userService.findUserPage(map);
        System.out.println("---->分页查询用户信息："+userPage);
    }

    /**
     * 3.根据id查询
     */
    @Test
    public void findUserByIdTest() {
        User userById = userService.findUserById(43);
        System.out.println("---->根据id查询：" + userById);
    }

    /**
     * 4.根据名称模糊查询
     */
    @Test
    public void findUserByNameTest() {
        List<User> userByName = userService.findUserByName("%张%");
        System.out.println("---->根据名称模糊查询："+userByName);
    }

    /**
     * 5.查询总数
     */
    @Test
    public void findTotalTest() {
        int total = userService.findTotal();
        System.out.println("---->查询总数："+total);
    }

    /**
     * 6.添加数据
     */
    @Test
    public void addUserTest() {
        User user = new User();
        user.setUsername("小红");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAddress("杭州西湖");
        int addUser = userService.addUser(user);
        System.out.println("---->添加数据："+addUser);
    }

    /**
     * 7.更新数据
     */
    @Test
    public void updateUserTest() {
        User user = userService.findUserById(56);
        user.setUsername("店小二");
        user.setAddress("广东深圳");
        int updateUser = userService.updateUser(user);
        System.out.println("---->更新数据："+updateUser);
    }

    /**
     * 8.根据id删除
     */
    @Test
    public void deleteUserByIdTest() {
        int deleteUserById = userService.deleteUserById(56);
        System.out.println("---->根据id删除："+deleteUserById);
    }

    /**
     * 9.联表查询，查询用户同时查询出账号
     */
    @Test
    public void findUserAndAccountTest() {
        List<User> userAndAccount = userService.findUserAndAccount();
        if (userAndAccount!=null) {
            for (User user : userAndAccount) {
                System.out.println("---->联表查询：" + user);
            }
        }
    }

}

package com.gxw.controller;

import com.gxw.pojo.User;
import com.gxw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * User用户控制器
 * @author GXW工作室
 * @date 2020/6/5 0005 - 23:43
 */
@RequestMapping("/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户信息列表
     *
     * @return
     */
    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    @ResponseBody
    public void  tofindUser(HttpSession session) {
        List<User> users = userService.findAll();
        session.setAttribute("list",users);
        System.out.println("--->查询数据:"+users);
    }
}

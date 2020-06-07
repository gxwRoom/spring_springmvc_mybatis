package com.gxw.controller;

import com.gxw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    @RequestMapping(value = "/findUser", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView toFindUser(ModelAndView model){
        model.setViewName("success");
        System.out.println("控制器");
        return model;
    }
}

package com.coocaa.demo.controller;

import com.coocaa.demo.pojo.User;
import com.coocaa.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by zhumengjia on 2015/12/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping( "/findUser")
    public ModelAndView findUser() throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        List<User> users = userService.findUser();
        modelAndView.addObject("users", users);
        //…Ë÷√œÏ”¶µƒJSP ‘Õº
        modelAndView.setViewName("findUser");
        return modelAndView;
    }

}

package com.percy.spring6.resource.controller;

import com.percy.spring6.resource.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("myUserController")//->(value="myUserController" )
public class UserController {

    //根據名稱注入
//    @Resource(name="myUserService")
//    private UserService userService;

    //根據類型進行匹配
    @Resource
    private UserService userService;

    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}

package com.percy.iocxml.auto.controller;

import com.percy.iocxml.auto.service.UserService;

public class UserController {


    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("UserControll method execute");

        userService.addUserService();
    }
}

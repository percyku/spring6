package com.percy.spring6.autowired.controller;

import com.percy.spring6.autowired.service.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //1.屬性注入
//    @Autowired
//    private UserService userService;

    //2.set方法注入
//    private UserService userService;
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    //3.構造方法注入
//    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
    //4.形參方法注入
//    private UserService userService;
//    public UserController( @Autowired UserService userService) {
//        this.userService = userService;
//    }

    //5.只有一個有參數構造器，無需註解
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }



    public void add(){
        System.out.println("controller...");
        userService.add();
    }
}

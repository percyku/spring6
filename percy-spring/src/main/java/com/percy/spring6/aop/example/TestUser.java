package com.percy.spring6.aop.example;

import com.percy.spring6.aop.example.bean.AnnotationApplicationContext;
import com.percy.spring6.aop.example.bean.ApplicationContext;
import com.percy.spring6.aop.example.service.UserService;
import org.junit.jupiter.api.Test;

public class TestUser {

    @Test
    public void TestUser1(){
        ApplicationContext context =new AnnotationApplicationContext("com.percy");
        UserService userService = (UserService)context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}

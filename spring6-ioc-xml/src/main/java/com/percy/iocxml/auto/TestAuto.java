package com.percy.iocxml.auto;

import com.percy.iocxml.auto.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {

    //根據類型自動裝配
    @Test
    public void TestAuto1(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-auto.xml");

        UserController userController =(UserController)context.getBean("userController");
        userController.addUser();
    }


    //根據名稱自動裝配
    @Test
    public void TestAuto2(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-auto.xml");

        UserController userController =(UserController)context.getBean("userController");
        userController.addUser();
    }
}

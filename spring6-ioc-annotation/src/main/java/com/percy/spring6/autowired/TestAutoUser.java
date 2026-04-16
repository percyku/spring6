package com.percy.spring6.autowired;


import com.percy.spring6.autowired.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoUser {

    @Test
    public void TestUserController(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");

        UserController controller=(UserController)context.getBean("userController",UserController.class);

        System.out.println(controller);


        controller.add();
    }
}

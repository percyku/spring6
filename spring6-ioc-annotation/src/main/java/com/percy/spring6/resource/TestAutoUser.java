package com.percy.spring6.resource;


import com.percy.spring6.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoUser {

    @Test
    public void TestUserController(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");

        UserController controller=(UserController)context.getBean("myUserController", UserController.class);

        System.out.println(controller);


        controller.add();
    }
}

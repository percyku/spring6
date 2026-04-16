package com.percy.spring6;

import com.percy.spring6.config.SpringConfig;
import com.percy.spring6.resource.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserAnnotation {

    @Test
    public void TestUserAnnotation1(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController controller=(UserController)context.getBean("myUserController", UserController.class);

        System.out.println(controller);


        controller.add();
    }
}

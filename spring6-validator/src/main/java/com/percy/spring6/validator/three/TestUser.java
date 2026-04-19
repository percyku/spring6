package com.percy.spring6.validator.three;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {



    @Test
    public void TestThree(){
        ApplicationContext context =new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user =new User();
        user.setName("percy");
        user.setAge(123);
        user.setPhone("13566754321");
        user.setMessage("123");


        service.testMethod(user);
    }


    @Test
    public void TestFour(){
        ApplicationContext context =new AnnotationConfigApplicationContext(ValidationConfig.class);
        MyService service = context.getBean(MyService.class);
        User user =new User();
        user.setName("percy");
        user.setAge(123);
        user.setPhone("13566754321");
        user.setMessage("12 3");


        service.testMethod(user);
    }
}

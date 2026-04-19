package com.percy.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {


    @Test
    public void testValidationOne(){
        ApplicationContext context =new AnnotationConfigApplicationContext(ValidatorConfig.class);
        MyValidation1 validation1 = context.getBean(MyValidation1.class);
        User user =new User();
        user.setName("percy");
        user.setAge(170);

        boolean b = validation1.validatorByUserOne(user);

        System.out.println(b);

    }


    @Test
    public void testValidationTwo(){
        ApplicationContext context =new AnnotationConfigApplicationContext(ValidatorConfig.class);
        MyValidation2 validation2 = context.getBean(MyValidation2.class);
        User user =new User();
        user.setName("percy");
        user.setAge(170);

        boolean b = validation2.validatorByUserTwo(user);

        System.out.println(b);

    }
}

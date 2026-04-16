package com.percy.iocxml.factorybean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

    @Test
    public void TestFactory1(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-factorybean.xml");
        User user= (User)context.getBean("user");
        System.out.println(user);
    }
}

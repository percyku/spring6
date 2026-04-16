package com.percy.spring6.bean;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoScan {
    @Test
    public void TestAutoScan1(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");

        User user=(User)context.getBean("user",User.class);

        System.out.println(user);
    }


}

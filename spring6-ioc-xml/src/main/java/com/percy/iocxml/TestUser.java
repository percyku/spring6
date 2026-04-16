package com.percy.iocxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    @Test
    public void TestUser1(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean.xml");

        //根據id
        User user1 = (User)context.getBean("user");
        System.out.println("根據id:"+user1);

        //根據類型
//        User user2 = (User)context.getBean(User.class);
//        System.out.println("根據類型:"+user2);


        //根據id與類型
        User user3 = (User)context.getBean("user",User.class);
        System.out.println("根據id與類型:"+user3);
    }
}

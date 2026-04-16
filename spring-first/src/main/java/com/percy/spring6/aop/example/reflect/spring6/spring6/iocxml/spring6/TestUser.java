package com.percy.spring6.aop.example.reflect.spring6.spring6.iocxml.spring6;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {


    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean.xml");

        User user =(User)context.getBean("user");

        System.out.println("1."+user);
        System.out.println("2."+user);
//
        user.add();


        logger.info("Test:"+user);
    }


    @Test
    public void testUserObject1() throws Exception {
        Class clazz= Class.forName("com.percy.spring6.aop.example.reflect.spring6.spring6.iocxml.spring6.User");

        User user = (User)clazz.getDeclaredConstructor().newInstance();
                    }
}

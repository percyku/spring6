package com.percy.iocxml.life;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanLife {

    @Test
    public void TestBeanLife1(){
        ClassPathXmlApplicationContext context  =new ClassPathXmlApplicationContext("bean-life.xml");

        User user = (User)context.getBean("user",User.class);
        System.out.println("6 bean對象創建完成了 可以使用");
        System.out.println(user);

        context.close();


    }
}

package com.percy.spring6.prefix;

import com.percy.spring6.di.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class TestDemon {

    public static void main(String[] args) {
//        ApplicationContext context =new ClassPathXmlApplicationContext("bean-di.xml");

//        Resource resource = context.getResource("percy.txt");
//
//        System.out.println(resource.getDescription());

        //也可以透過classpath: + *加載找到對應的檔案
        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:bean*.xml");
        User user = context.getBean(User.class);
        System.out.println(user);


    }
}

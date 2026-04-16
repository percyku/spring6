package com.percy.iocxml;

import com.percy.iocxml.bean.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {

    public static void main(String[] args) {
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean.xml");


        UserDao userDao = (UserDao)context.getBean(UserDao.class);
        System.out.println("根據類型:"+userDao);
        userDao.run();
    }

}

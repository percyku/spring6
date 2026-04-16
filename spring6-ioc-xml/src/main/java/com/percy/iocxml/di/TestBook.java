package com.percy.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

    @Test
    public void TestSetter(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-di.xml");

        Book book1 = (Book)context.getBean("book",Book.class);
        System.out.println(book1);


        Book book2 = (Book)context.getBean("bookCon",Book.class);
        System.out.println(book2);


    }
}

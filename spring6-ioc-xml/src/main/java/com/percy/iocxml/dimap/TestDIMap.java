package com.percy.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDIMap {

    @Test
    public void TestDITestMap(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-dimap.xml");

        Student student = (Student)context.getBean("student",Student.class);

        student.run();
    }

    @Test
    public void TestDITestRef(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-diref.xml");

        Student student = (Student)context.getBean("student",Student.class);

        student.run();
    }


    @Test
    public void TestDITestRefP(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-diref.xml");

        Student student = (Student)context.getBean("studentp ",Student.class);

        student.run();
    }

}

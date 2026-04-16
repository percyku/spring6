package com.percy.iocxml.ditest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDITest {

    //1.外部引入bean測試
    @Test
    public void TestDITest1(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-ditest.xml");

        Emp emp1 = (Emp)context.getBean("emp",Emp.class);

        emp1.work();
    }

    //2.內部入bean注入
    @Test
    public void TestDITest2(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-ditest.xml");

        Emp emp2 = (Emp)context.getBean("emp2",Emp.class);

        emp2.work();
    }
    //3.級別賦值
    @Test
    public void TestDITest3(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-ditest.xml");

        Emp emp3 = (Emp)context.getBean("emp3",Emp.class);

        emp3.work();
    }


    @Test
    public void TestDITestArray(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-diarray.xml");

        Emp emp = (Emp)context.getBean("emp",Emp.class);

        emp.workArray();
    }


    @Test
    public void TestDITestList(){
        ApplicationContext context  =new ClassPathXmlApplicationContext("bean-dilist.xml");

        Dept dept = (Dept)context.getBean("dept",Dept.class);

        dept.info();
    }


}

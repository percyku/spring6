package com.percy.spring6.springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceI18n {

    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");


        Object[] objs= {"小古",new Date().toString()};
        String message1 = context.getMessage("www.percy.com", objs, Locale.TAIWAN);
        System.out.println(message1);


        Object[] objs2= {"percy",new Date().toString()};
        String message2 = context.getMessage("www.percy.com", objs2, Locale.UK);
        System.out.println(message2);








    }
}

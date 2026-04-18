package com.percy.spring6.tx;

import com.percy.spring6.tx.config.SpringConfig;
import com.percy.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnno {

    @Test
    public void testTxAllAnnotation(){
        ApplicationContext applicationContext =new AnnotationConfigApplicationContext(SpringConfig.class);
        BookController bookController =applicationContext.getBean("bookController",BookController.class);
        Integer[] bookIds={1};
        bookController.checkout(bookIds,3);


    }
}

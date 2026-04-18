package com.percy.spring6.xmltx;

import com.percy.spring6.xmltx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean-xml.xml")
public class TestBookTx {

    @Autowired
    BookController bookController;

    @Test
    public void TestBuyBook(){
        bookController.buyBook(1,3);
    }
}

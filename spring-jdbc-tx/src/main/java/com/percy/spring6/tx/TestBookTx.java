package com.percy.spring6.tx;

import com.percy.spring6.tx.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestBookTx {

    @Autowired
    BookController bookController;

    @Test
    public void TestBuyBook(){
//        bookController.buyBook(1,2);

        //傳播行為測試
        Integer[] bookIds={1,2};
        bookController.checkout(bookIds,3);
    }
}

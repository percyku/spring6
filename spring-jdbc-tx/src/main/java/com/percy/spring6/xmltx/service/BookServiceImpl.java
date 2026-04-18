package com.percy.spring6.xmltx.service;

import com.percy.spring6.xmltx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    @Override
    public void buyBook(Integer bookId, Integer userId) {

        //according to book_id's price
        int price = bookDao.getBookPrice(bookId);


        //update book stock -1
        bookDao.updateStock(bookId);


        //update user balance -book_id's price
        bookDao.updateUserBalance(userId,price);

    }
}

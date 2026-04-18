package com.percy.spring6.tx.service;

import com.percy.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Transactional

//只能讀取，修改刪除會出錯
//@Transactional(readOnly = true)

//超時
//@Transactional(timeout = 3)

//回滾策略
//@Transactional(noRollbackFor = ArithmeticException.class)
//@Transactional(noRollbackForClassName = "java.lang.ArithmeticException")

//隔離級別
//@Transactional(isolation = Isolation.DEFAULT)

//傳播行為
//@Transactional(propagation = Propagation.REQUIRES)//當前事物已經有的，就會拿當前的，沒有則會建立新的事物
//@Transactional(propagation = Propagation.REQUIRES_NEW)//每次執行都對新增新的事物，與之前的事物不存在關係
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;


    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //TODO 模擬超時
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        }catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }


        //according to book_id's price
        int price = bookDao.getBookPrice(bookId);


        //update book stock -1
        bookDao.updateStock(bookId);


        //update user balance -book_id's price
        bookDao.updateUserBalance(userId,price);

//        //回滾策略
//        System.out.println(1/0);

    }
}

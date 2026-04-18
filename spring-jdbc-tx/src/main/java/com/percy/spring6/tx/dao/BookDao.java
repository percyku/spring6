package com.percy.spring6.tx.dao;

public interface BookDao {


    Integer getBookPrice(Integer bookId);
    void updateStock(Integer bookId);
    void updateUserBalance(Integer userId,Integer price);
}

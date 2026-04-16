package com.percy.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoRedisDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao UserDaoRedisDaoImpl....");
    }
}

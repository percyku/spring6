package com.percy.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDaoRedisDaoImpl") //->(value="myUserDaoRedisDaoImpl" )
public class UserDaoRedisDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao UserDaoRedisDaoImpl....");
    }
}

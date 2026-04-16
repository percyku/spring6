package com.percy.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDao")//->(value="myUserDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao...");
    }
}

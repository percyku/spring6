package com.percy.spring6.aop.example.dao.impl;

import com.percy.spring6.aop.example.anno.Bean;
import com.percy.spring6.aop.example.dao.UserDao;
@Bean
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add....");
    }
}

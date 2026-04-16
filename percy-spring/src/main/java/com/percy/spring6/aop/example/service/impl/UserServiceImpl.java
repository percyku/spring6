package com.percy.spring6.aop.example.service.impl;

import com.percy.spring6.aop.example.anno.Bean;
import com.percy.spring6.aop.example.anno.Di;
import com.percy.spring6.aop.example.dao.UserDao;
import com.percy.spring6.aop.example.service.UserService;

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service add...");
        userDao.add();
    }
}

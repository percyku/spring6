package com.percy.spring6.resource.service;

import com.percy.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("myUserService") //->(value="myUserService")
public class UserServiceImpl implements UserService {

    //不指定名稱，就會根據屬性名稱注入
    @Resource
    private UserDao myUserDao;

    @Override
    public void add() {
        System.out.println("service...");
        myUserDao.add();
    }
}

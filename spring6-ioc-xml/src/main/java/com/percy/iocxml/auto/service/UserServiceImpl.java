package com.percy.iocxml.auto.service;

import com.percy.iocxml.auto.dao.UserDao;

public class UserServiceImpl implements UserService{
//   private UserDao userDao;
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


    private UserDao userDaoImpl;

    public void setUserDaoImpl(UserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    public void addUserService() {
        System.out.println("userService method execute");
//        userDao.addUserDao();
        userDaoImpl.addUserDao();
    }
}

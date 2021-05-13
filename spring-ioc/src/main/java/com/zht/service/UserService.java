package com.zht.service;

import com.zht.dao.UserDao;
import com.zht.dao.UserDaoImpl;

public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }


}

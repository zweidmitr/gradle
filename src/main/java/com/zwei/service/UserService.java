package com.zwei.service;

import com.zwei.dao.UserDao;
import com.zwei.model.User;

import java.util.List;

public class UserService {
    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}

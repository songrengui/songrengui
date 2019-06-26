package com.srg.service.impl;

import com.srg.dao.UserDao;
import com.srg.entity.User;
import com.srg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public void addUser(User user) {
        this.userDao.saveUser(user);
    }
}

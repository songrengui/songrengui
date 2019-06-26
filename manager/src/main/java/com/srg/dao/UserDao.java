package com.srg.dao;

import com.srg.entity.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);
    List<User> queryAll();
}

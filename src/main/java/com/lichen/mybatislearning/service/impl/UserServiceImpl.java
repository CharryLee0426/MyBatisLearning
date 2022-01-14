package com.lichen.mybatislearning.service.impl;

import com.lichen.mybatislearning.dao.UserDao;
import com.lichen.mybatislearning.entity.User;
import com.lichen.mybatislearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listAll() {
        return userDao.listAll();
    }
}

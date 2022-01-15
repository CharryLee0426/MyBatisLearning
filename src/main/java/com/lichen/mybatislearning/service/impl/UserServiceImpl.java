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

    @Override
    public User listById(int id) {
        return userDao.listById(id);
    }

    @Override
    public User updateSalaryById(int id, Long salary) {
        userDao.updateSalaryById(id, salary);
        return userDao.listById(id);
    }
}

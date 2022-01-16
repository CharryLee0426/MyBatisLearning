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

    @Override
    public String deleteById(int id) {
        try {
            userDao.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Delete Success!";
    }

    @Override
    public String addUser(int id, String name, Long salary, int dep_id) {
        try {
            userDao.addUser(id, name, salary, dep_id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Add User Success";
    }

    @Override
    public List<User> listAllInfo() {
        return userDao.listAllInfo();
    }
}

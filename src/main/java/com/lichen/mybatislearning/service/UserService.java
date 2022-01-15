package com.lichen.mybatislearning.service;


import com.lichen.mybatislearning.entity.User;

import java.util.List;

public interface UserService {
    // just list all.
    List<User> listAll();

    // select * from user where id = {id}
    User listById(int id);
}

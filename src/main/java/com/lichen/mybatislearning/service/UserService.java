package com.lichen.mybatislearning.service;


import com.lichen.mybatislearning.entity.User;

import java.util.List;

public interface UserService {
    // just list all.
    List<User> listAll();

    // select * from user where id = {id}
    User listById(int id);

    // update user set salary = {salary} where id = {id}
    User updateSalaryById(int id, Long salary);

    // delete from user where id = {id}
    String deleteById(int id);

    // insert into user value (...)
    String addUser(int id, String name, Long salary, int dep_id);
}

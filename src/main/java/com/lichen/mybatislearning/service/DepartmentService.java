package com.lichen.mybatislearning.service;

import com.lichen.mybatislearning.entity.Department;
import com.lichen.mybatislearning.entity.User;

import java.util.List;

public interface DepartmentService {
    List<Department> list();

    List<User> listUserByDepId(int id);
}

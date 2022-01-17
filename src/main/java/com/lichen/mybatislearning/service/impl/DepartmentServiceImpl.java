package com.lichen.mybatislearning.service.impl;

import com.lichen.mybatislearning.dao.DepartmentDao;
import com.lichen.mybatislearning.entity.Department;
import com.lichen.mybatislearning.entity.User;
import com.lichen.mybatislearning.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<Department> list() {
        return departmentDao.list();
    }

    @Override
    public List<User> listUserByDepId(int id) {
        return departmentDao.listUserByDepId(id);
    }
}

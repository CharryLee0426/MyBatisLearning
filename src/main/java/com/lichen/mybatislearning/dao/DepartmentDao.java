package com.lichen.mybatislearning.dao;

import com.lichen.mybatislearning.entity.Department;
import com.lichen.mybatislearning.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentDao {
    // list all
    List<Department> list();

    // list the users of the department
    List<User> listUserByDepId(@Param("dep_id") int depId);
}

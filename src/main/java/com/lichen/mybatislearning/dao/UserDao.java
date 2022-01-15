package com.lichen.mybatislearning.dao;

import com.lichen.mybatislearning.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {
    // 列出所有的用户资料
    List<User> listAll();

    // 根据 Id 返回用户资料
    User listById(@Param("id") int id);

    // 根据 id 更新用户的工资信息,返回修改后的值
    User updateSalaryById(@Param("id") int id, @Param("salary") Long salary);
}

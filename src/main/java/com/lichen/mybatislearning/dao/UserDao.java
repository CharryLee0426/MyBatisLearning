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
}

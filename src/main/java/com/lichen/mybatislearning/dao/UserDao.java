package com.lichen.mybatislearning.dao;

import com.lichen.mybatislearning.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    // 列出所有的用户资料
    List<User> listAll();
}

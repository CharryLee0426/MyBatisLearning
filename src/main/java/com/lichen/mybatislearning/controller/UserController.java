package com.lichen.mybatislearning.controller;

import com.lichen.mybatislearning.entity.User;
import com.lichen.mybatislearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {
        return userService.listAll();
    }
}

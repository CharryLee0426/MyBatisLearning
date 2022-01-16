package com.lichen.mybatislearning.controller;

import com.lichen.mybatislearning.entity.User;
import com.lichen.mybatislearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public  User getById(@PathVariable int id) {
        return  userService.listById(id);
    }

    @GetMapping("/update/salary")
    public User updateSalaryById(@RequestParam(value = "id", required = true) int id,
                                 @RequestParam(value = "salary", required = true) Long salary) {
        return userService.updateSalaryById(id, salary);
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        return userService.deleteById(id);
    }

    @GetMapping("/add")
    public String addUser(@RequestParam(value = "id", required = true) int id,
                          @RequestParam(value = "name", required = true) String name,
                          @RequestParam(value = "salary", required = true) Long salary,
                          @RequestParam(value = "depid", required = true) int dep_id) {
        return userService.addUser(id, name, salary, dep_id);
    }
}

package com.lichen.mybatislearning.controller;

import com.lichen.mybatislearning.entity.Department;
import com.lichen.mybatislearning.entity.User;
import com.lichen.mybatislearning.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/dep")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/list")
    public List<Department> list() {
        return departmentService.list();
    }

    @GetMapping("/list/user")
    public List<User> listUserByDepId(@RequestParam(value = "did", required = true) int id) {
        return departmentService.listUserByDepId(id);
    }
}
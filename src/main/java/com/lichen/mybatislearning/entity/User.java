package com.lichen.mybatislearning.entity;

public class User {
    private Integer id;
    private String name;
    private Long salary;
    private Department department;

    // NoArgsjConstructor
    public User() {
    }

    // AllArgsConstructor
    public User(Integer id, String name, Long salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    // getter and setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

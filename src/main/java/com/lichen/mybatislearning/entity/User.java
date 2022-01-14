package com.lichen.mybatislearning.entity;

public class User {
    private Integer id;
    private String name;
    private Long salary;

    // NoArgsjConstructor
    public User() {
    }

    // AllArgsConstructor
    public User(Integer id, String name, Long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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
}

package com.lichen.mybatislearning.entity;

import java.util.List;

public class Tag {
    private int id;
    private String name;
    private List<Blog> blogs;

    // NoArgConstructor
    public Tag() {
    }

    // AllArgsConstructor
    public Tag(int id, String name, List<Blog> blogs) {
        this.id = id;
        this.name = name;
        this.blogs = blogs;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}

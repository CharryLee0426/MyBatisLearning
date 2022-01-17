package com.lichen.mybatislearning.entity;

import java.util.List;

public class Blog {
    private int id;
    private String title;
    private List<Tag> tags;

    //NoArgConstructor
    public Blog() {
    }

    //AllArgsConstructor
    public Blog(int id, String title, List<Tag> tags) {
        this.id = id;
        this.title = title;
        this.tags = tags;
    }

    // getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}

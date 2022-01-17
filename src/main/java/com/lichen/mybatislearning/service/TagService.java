package com.lichen.mybatislearning.service;

import com.lichen.mybatislearning.entity.Tag;

import java.util.List;

public interface TagService {
    public List<Tag> listBlogByTagId(int tagId);
}

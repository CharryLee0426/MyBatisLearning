package com.lichen.mybatislearning.service.impl;

import com.lichen.mybatislearning.dao.TagDao;
import com.lichen.mybatislearning.entity.Blog;
import com.lichen.mybatislearning.entity.Tag;
import com.lichen.mybatislearning.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagDao tagDao;

    @Override
    public List<Tag> listBlogByTagId(int tagId) {
        return tagDao.listBlogByTagId(tagId);
    }
}

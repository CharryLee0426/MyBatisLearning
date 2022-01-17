package com.lichen.mybatislearning.dao;

import com.lichen.mybatislearning.entity.Tag;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TagDao {
    // list all blogs belong to the specific tag
    public List<Tag> listBlogByTagId(@Param("tagid") int tagId);
}

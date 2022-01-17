package com.lichen.mybatislearning.controller;

import com.lichen.mybatislearning.entity.Tag;
import com.lichen.mybatislearning.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/tag")
public class TagController {
    @Autowired
    private TagService tagService;

    @GetMapping("/listblog")
    public List<Tag> listBlogByTagId(@RequestParam(value = "tid", required = true) int tagId) {
        return tagService.listBlogByTagId(tagId);
    }
}

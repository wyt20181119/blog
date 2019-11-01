package com.blog.service.impl;

import com.blog.mapper.BlogsMapper;
import com.blog.pojo.Blogs;
import com.blog.pojo.Comments;
import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/15/015
 * Time: 20:14
 * Description: No Description
 */
@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogsMapper bm;


    @Override
    public String add(Blogs blogs) {
        bm.add(blogs);
        return "ok";
    }

    @Override
    public List findAll() {

        return bm.findAll();
    }

    @Override
    public List findOneById(String blogid) {

        return bm.findOneById(blogid);
    }

    @Override
    public Blogs findOneByTitle(String title) {
        return null;
    }

    @Override
    public void blogUpdate(Blogs blogs) {
        bm.blogUpdate(blogs);

    }

    @Override
    public void blogDelete(String blogid) {
        bm.blogDelete(blogid);
    }

    @Override
    public void blogCommentAdd(Comments comment) {
        bm.blogCommentAdd(comment);
    }

    @Override
    public List findAllComment(String blogid) {
        return bm.findAllComment(blogid);
    }


    @Override
    public void blogCommentDelete(String commentid) {
        bm.blogCommentDelete(commentid);
    }

    @Override
    public List blogSearch(String search) {

        List list = bm.blogSearch(search);

        //String s = "%"+search+"%";
        //List list = bm.blogSearch(s);
        return list;
    }

    @Override
    public List blogSearch2(String search) {
        String s = "%"+search+"%";
        List list = bm.blogSearch(s);
        return list;
    }
}

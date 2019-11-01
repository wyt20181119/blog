package com.blog.service;

import com.blog.pojo.Blogs;
import com.blog.pojo.Comments;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/15/015
 * Time: 20:11
 * Description: No Description
 */
public interface BlogService {

    //添加博客
   String add(Blogs blogs);
   //查询全部
   List findAll();
   //查询单个
   List findOneById(String blogid);
   //根据标题查询
   Blogs findOneByTitle(String title);
   //修改博客
   void blogUpdate(Blogs blogs);
   //删除博客
   void blogDelete(String blogid);
   //添加评论
   void blogCommentAdd(Comments comment);
   //查询评论
   List findAllComment(String blogid);
   //删除评论
   void blogCommentDelete(String commentid);
   //搜索
   List blogSearch(String search);
   //搜索,方法二
   List blogSearch2(String search);

}


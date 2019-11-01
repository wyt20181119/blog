package com.blog.mapper;

import com.blog.pojo.Blogs;
import com.blog.pojo.Comments;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/15/015
 * Time: 20:16
 * Description: No Description
 */
public interface BlogsMapper {
    void add(Blogs blogs);
    List findAll();
    List findOneById(String blogid);
    void blogUpdate(Blogs blogs);
    void blogDelete(String blogid);
    void blogCommentAdd(Comments comment);
    List findAllComment(String blogid);
    void blogCommentDelete(String commentid);
    List blogSearch(String search);
    List blogSearch2(String search);

}

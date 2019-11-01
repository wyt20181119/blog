package com.blog.pojo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/15/015
 * Time: 20:08
 * Description: No Description
 */
public class Blogs {

    //博客id
    private String blogid;

    //用户id
    private String userid;

    private String title;

    private String blog_content;

    private Date createtime;

    private Date updatetime;

    @Override
    public String toString() {
        return "Blogs{" +
                "blogid='" + blogid + '\'' +
                ", userid='" + userid + '\'' +
                ", title='" + title + '\'' +
                ", blog_content='" + blog_content + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }

    public Blogs( ) {

    }

    public Blogs(String blogid, String userid, String title, String blog_content, Date createtime, Date updatetime) {
        this.blogid = blogid;
        this.userid = userid;
        this.title = title;
        this.blog_content = blog_content;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlog_content() {
        return blog_content;
    }

    public void setBlog_content(String blog_content) {
        this.blog_content = blog_content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}

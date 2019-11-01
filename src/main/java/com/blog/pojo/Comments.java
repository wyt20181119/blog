package com.blog.pojo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/17/017
 * Time: 20:51
 * Description: No Description
 */
public class Comments {

    private String commentid;//评论id
    private String userid;
    private String blogid;
    private String commentContent;//评论内容
    private Date createtime;//评论时间

    //小辣椒插件  Lombok


    @Override
    public String toString() {
        return "Comments{" +
                "commentid='" + commentid + '\'' +
                ", userid='" + userid + '\'' +
                ", blogid='" + blogid + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public Comments() {

    }

    public Comments(String commentid, String userid, String blogid, String commentContent, Date createtime) {
        this.commentid = commentid;
        this.userid = userid;
        this.blogid = blogid;
        this.commentContent = commentContent;
        this.createtime = createtime;
    }

    public String getCommentid() {
        return commentid;
    }

    public void setCommentid(String commentid) {
        this.commentid = commentid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getBlogid() {
        return blogid;
    }

    public void setBlogid(String blogid) {
        this.blogid = blogid;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}

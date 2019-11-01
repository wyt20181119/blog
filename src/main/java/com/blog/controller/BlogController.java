package com.blog.controller;

import com.blog.pojo.Blogs;
import com.blog.pojo.Comments;
import com.blog.service.BlogService;
import com.blog.util.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/15/015
 * Time: 19:56
 * Description: No Description
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogService bsi;



    /**
     * 跳转发博客界面
     * @return
     */
    @RequestMapping("/addIndex")
    //@ResponseBody  //返回json数据，这样的话就直接显示数据
    public String index(){
        return "blogadd";
    }

    @RequestMapping("/add")
    public String addBlog(@ModelAttribute("blogs") Blogs blogs){

        //blogsid
        String blogid = RandomString.getCharAndNumr();
        blogs.setBlogid(blogid);

        blogs.setCreatetime(new Date());

        bsi.add(blogs);

        System.out.println(blogs);

        return "ok";
    }



    @RequestMapping("/findOne/{blogid}")
    //@RequestParam("blogid")  @RequestParam("userid")  ///findOne?{blogid}&{userid}
    public String findOneById(Model model, @PathVariable(value = "blogid") String blogid){

        //详细博客内容
        Map<Object, Object> map = new HashMap<>();
        List list = bsi.findOneById(blogid);
        map.put("lists",list);

        model.addAttribute("lists",map.get("lists"));

        //评论
        List list2 = bsi.findAllComment(blogid);
        map.put("comments",list2);

        model.addAttribute("comments",map.get("comments"));

        return "bloglist";
    }

    @RequestMapping("/blogEdit/{blogid}")
    public String blogEdit(Model model, @PathVariable String blogid){
        Map<Object, Object> map = new HashMap<>();
        List list = bsi.findOneById(blogid);
        map.put("lists",list);

        model.addAttribute("lists",map.get("lists"));

        return "blogedit";
    }


    @RequestMapping("/blogUpdate")
    public String blogUpdate(Model model, @ModelAttribute("blogs") Blogs blogs){

        blogs.setUpdatetime(new Date());
        bsi.blogUpdate(blogs);

        return "ok";
    }

    @RequestMapping("/blogDelete/{blogid}")
    public String blogDelete(Model model, @PathVariable String blogid){

        bsi.blogDelete(blogid);

        return "delete";
    }


    @RequestMapping("/blogCommentAdd")
    public ModelAndView blogCommentAdd(Model model, @ModelAttribute("comment") Comments comments){

        comments.setCommentid(RandomString.getCharAndNumr());
        comments.setCreatetime(new Date());
        bsi.blogCommentAdd(comments);

        return new ModelAndView("bloglist");
    }

    @RequestMapping("/blogCommentDelete/{commentid}")
    public ModelAndView blogCommentDelete(Model model, @PathVariable String commentid){


        bsi.blogCommentDelete(commentid);

        return new ModelAndView("bloglist");
    }

    @RequestMapping("/search")
    public String blogSearch(Model model, @ModelAttribute("search") String search){
        Map<Object, Object> map = new HashMap<>();
        //List list = bsi.blogSearch(search);
        List list = bsi.blogSearch2(search);
        map.put("lists",list);
        System.out.println("search:"+search);

        model.addAttribute("lists",map.get("lists"));

        return "search";
    }






}

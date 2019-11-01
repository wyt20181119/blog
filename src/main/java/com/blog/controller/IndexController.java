package com.blog.controller;

import com.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/15/015
 * Time: 20:49
 * Description: No Description
 */
@Controller
public class IndexController {

    //@Value("#{server.port}")
    private String port;

    /**
     * value = {"/","/index"}这样写法是数组形式，随便一个匹配都行
     * @param model
     * @return
     */
    @RequestMapping(value = {"/","/index"})
    public String index1(Model model){
        System.out.println("返回首页");
        System.out.println("port:"+port);
        Map<Object, Object>  map = findAll();
        model.addAttribute("lists", map.get("lists"));
        return "index";
    }


    @Autowired
    private BlogService bsi;

    /**
     * 查询全部，打开博客界面的时候会全部查询出来
     * @return
     */
    private Map findAll() {
        System.out.println("findAll");
        Map<Object, Object> map = new HashMap<>();
        List list = bsi.findAll();
        map.put("lists",list);
        return map;
    }


}

package com.bjsxt.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//添加controller注解
@Controller
public class PageController {

//    请求前缀
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}

package com.one.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 我的第一个拦截器测试
 */

@Controller
public class MyInterceptorTest {


    @RequestMapping("/interceptor01")
    public String test01(){
        System.out.println("请求方法执行中...");
        return "index";
    }

}

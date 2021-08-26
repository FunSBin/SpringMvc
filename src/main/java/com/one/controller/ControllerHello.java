package com.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;


@Controller
//@SessionAttributes("res")
public class ControllerHello {

    @Autowired
    HttpSession httpSession;

    @RequestMapping("/Hello")
    public String hello(String name) {
        System.out.println("hello springMvc:" + name);
        return "test";
    }


    @GetMapping("/InternalResourceViewResolver/{name}")
    public String internalResourceViewResolver(@PathVariable("name") String name) {
        System.out.println("hello springMvc:" + name);
        return "test";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        System.out.println("Model，已经执行");

        model.addAttribute("res", "这边用model传的");
        return "test";
    }

    @RequestMapping("/modelMap")
    public String modelMap(ModelMap modelMap) {
        System.out.println("modelMap，已经执行");

        modelMap.addAttribute("res", "这边用modelMap传的");
        return "test";
    }

    @RequestMapping("/map")
    public String map(Map map) {
        System.out.println("Map，已经执行");

        map.put("res", "这边用Map传的");
        return "test";
    }

    @Autowired
    MyModelAndView modelAndView;

    @RequestMapping("/modelAndView")
    public ModelAndView modelAndView() {
        modelAndView.setViewName("test");
        modelAndView.addObject("res","MyModelAndView");
        return modelAndView;
    }

    @RequestMapping("/session")
    public String session() {
        httpSession.setAttribute("res","这边用session传的");
        return "test";
    }


    @ModelAttribute
    public void ModelAttribute(){
        System.out.println("ModelAttribute，已经执行");
    }


    @RequestMapping("/forward01")
    public String forward01() {

        return "forward:/forward02";
    }

    @RequestMapping("/forward02")
    public String forward02() {

        return "forward:/test";
    }

}


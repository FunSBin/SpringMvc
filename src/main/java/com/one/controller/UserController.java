package com.one.controller;

import com.one.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.SortedMap;

@Controller
public class UserController {


    @RequestMapping(value = "/setUser/{name}/{age}")
    public String setUser(
//            User user
            @PathVariable("name") String name,
            @PathVariable("age") Integer age,
            @PathVariable("birthDate") String birthDate

    ){
//        System.out.println(user);
        System.out.println(name+age+"-"+birthDate);
        return "test";
    }

}

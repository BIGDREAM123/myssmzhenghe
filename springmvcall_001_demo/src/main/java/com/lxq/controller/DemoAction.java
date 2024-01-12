package com.lxq.controller;

import org.springframework.format.datetime.DateFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;

@Controller
public class DemoAction {
    SimpleDateFormat sf= new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("/demo")
    public String demo(){
        System.out.println("访问服务器成功");
        return "main";

    }
    @RequestMapping("/a.action")
    public String demo2(String name, int age){
        System.out.println(name);
        System.out.println(age);


        return "forward:/WEB-INF/asd.jsp";


    }
}

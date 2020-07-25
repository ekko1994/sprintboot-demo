package com.zh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author zhanghao
 * @date 2020/7/8 - 14:43
 */
@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("msg", "<h1>hello thymeleaf</h1>");
        model.addAttribute("users", Arrays.asList("1","2"));

        return "test";
    }
}

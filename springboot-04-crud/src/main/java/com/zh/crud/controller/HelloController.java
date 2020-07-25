package com.zh.crud.controller;

import com.zh.crud.exception.UserNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/7/9 - 10:20
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

/*    @GetMapping({"/","index.html"})
    public String index(){
        return "index";
    }*/

    @ResponseBody
    @RequestMapping("/e")
    public String exception(@RequestParam("username") String username){
        if("aaa".equals(username)){
            throw new UserNotFoundException("用户不存在");
        }
        return "hello";
    }
}

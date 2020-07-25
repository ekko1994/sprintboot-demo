package com.zh.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/7/10 - 14:06
 */
@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password")String password
            , HttpSession httpSession, Map<String, Object> map){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            httpSession.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else {
            map.put("msg", "你的用户名密码错误");
            return "login";
        }
    }
}

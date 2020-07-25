package com.zh.crud.controller;

import com.zh.crud.exception.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/7/13 - 15:47
 */
@ControllerAdvice
public class MyExceptionHandler {

//    @ResponseBody
//    @ExceptionHandler(UserNotFoundException.class)
//    public Map<String, Object> handlerUserNotFoundException(Exception e){
//        Map<String, Object> map = new HashMap<>();
//        map.put("code","user.notexist");
//        map.put("message",e.getMessage());
//        return map;
//    }


    @ExceptionHandler(UserNotFoundException.class)
    public String handlerUserNotFoundException(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("code","user.notexist");
        map.put("message",e.getMessage());

        request.setAttribute("ext", map);

        return "forword:/error";
    }
}

package com.zh.crud.exception;

/**
 * @author zhanghao
 * @date 2020/7/13 - 15:46
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}

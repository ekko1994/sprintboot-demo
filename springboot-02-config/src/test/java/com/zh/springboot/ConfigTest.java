package com.zh.springboot;

import com.zh.springboot.pojo.Dog;
import com.zh.springboot.pojo.Person;
import com.zh.springboot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author zhanghao
 * @date 2020/7/7 - 17:16
 */
@SpringBootTest
public class ConfigTest {

    @Autowired
    private Dog dog;

    @Autowired
    private Person person;

    @Autowired
    private User user;

    @Test
    void test1(){
        System.out.println(dog);
    }

    // 测试加载properties
    @Test
    void test2(){
        System.out.println(person);
    }

    // 测试加载指定的yml
    @Test
    void test3(){
        System.out.println(user);
    }
}

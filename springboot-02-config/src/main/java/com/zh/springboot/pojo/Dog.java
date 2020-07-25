package com.zh.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhanghao
 * @date 2020/7/7 - 17:05
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties("dog")
public class Dog {
    private String name;
    private Integer age;
}

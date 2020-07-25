package com.zh.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/7/7 - 17:17
 */
@Component
@ConfigurationProperties("person") //从application.yml中获取值
//@PropertySource("classpath:person.properties")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class Person {

//    @Email(message="不是email") JSR303
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

}

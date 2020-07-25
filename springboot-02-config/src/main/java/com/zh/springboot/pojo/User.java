package com.zh.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/7/7 - 17:54
 */
@Component
@PropertySource("classpath:user.yml")
@ConfigurationProperties("user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Value("${lastName}")
    private String lastName;
    @Value("${age}")
    private Integer age;
    @Value("${boss}")
    private Boolean boss;
    @Value("${birth}")
    private Date birth;

    @Value("#{${maps}}")
    private Map<Object, Object> maps;

    @Value("#{'${list}'.split(',')}")
    private List<Object> lists;

}

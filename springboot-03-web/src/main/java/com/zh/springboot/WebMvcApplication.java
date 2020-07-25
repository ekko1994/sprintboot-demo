package com.zh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.security.PublicKey;
import java.util.Locale;

/**
 * @author zhanghao
 * @date 2020/7/8 - 14:36
 */
@SpringBootApplication
@EnableWebMvc
public class WebMvcApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebMvcApplication.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
        return new  MyViewResolver();
    }
    private class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}

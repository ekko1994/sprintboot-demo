package com.zh.crud.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zhanghao
 * @date 2020/7/13 - 16:58
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter...doFilter...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}

package com.bjpowernode.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter extends OncePerRequestFilter{
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");                                      //允许所有网址发来的请求
        response.addHeader("Access-Control-Allow-Methods", "REQUEST,GET,POST,PUT,DELETE,PATCH,HEAD");//允许的请求方法
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");                          //,X-Requested-With,auth_token
        response.addHeader("Access-Control-Max-Age", "1800");//30 min
        filterChain.doFilter(request, response);
    }
}

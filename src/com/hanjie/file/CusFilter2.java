package com.hanjie.file;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebFilter("/*")
public class CusFilter2 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //转换属性
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();

        //第二种  正则源码来判断 login 访问路径要不要拦截
        Pattern compile = Pattern.compile(".*(css|js|Login.html|index.html|jpg|img|Login|AddEnter.html|AddUser.html)$");
        Matcher matcher = compile.matcher(requestURI);
        if (matcher.matches()){
            //放行
            filterChain.doFilter(servletRequest,servletResponse);

        }else {
            //不放行

            HttpSession session = request.getSession();
            Object file = session.getAttribute("file");

            if (file==null){
                System.out.println(1);
                //没有session记录则返回
                response.sendRedirect("/Login.html");
            }
            else {
                System.out.println(2);
                //有session则放行
                //请求放行  请求下一个资源/过滤器
                filterChain.doFilter(servletRequest,servletResponse);
            }




        }

    }

    @Override
    public void destroy() {

    }
}

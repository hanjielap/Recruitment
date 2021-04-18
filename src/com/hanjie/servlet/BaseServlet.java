package com.hanjie.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 公共访问类
 */
public class BaseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("operation");
        if (parameter != null && !"".equals(parameter)) {
            Class<? extends BaseServlet> aClass = this.getClass();
            try {
                Method declaredMethod = aClass.getDeclaredMethod(parameter, HttpServletRequest.class, HttpServletResponse.class);
                declaredMethod.invoke(this,req,resp);
            } catch (NoSuchMethodException e) {
                System.out.println("没有这个方法");
            } catch (IllegalAccessException e) {
                System.out.println("权限访问不足");
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }else {
            System.out.println(req.getRequestURI()+"当前请求参数为空");
        }
    }




}

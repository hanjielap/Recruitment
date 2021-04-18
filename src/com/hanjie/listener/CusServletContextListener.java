package com.hanjie.listener;

import com.hanjie.util.DbUtil;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听器 listener  监听Request 实现ServletRequestListener
 * 监听器 listener  监听Session  实现 HttpSessionListener
 * 监听器 listener  监听ServletContex 实现ServletContextListener
 * 初始化连接池
 */
@WebListener
public class CusServletContextListener implements ServletContextListener {


    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext创建了");
        //数据库连接池的初始化  不用在访问的时候在加载静态代码块
        try {
            Class<?> aClass = Class.forName("com.hanjie.util.DbUtil");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletContext销毁了");
        //下资源
        DbUtil.closePool();
    }
}

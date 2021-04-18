package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.dao.SuperUserDao;
import com.hanjie.entity.User;
import com.hanjie.entity.query.Userquery;
import com.hanjie.service.SuperEnterService;
import com.hanjie.service.SuperUserService;
import com.hanjie.service.impl.SuperEnterServiceimpl;
import com.hanjie.service.impl.SuperUserServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 管理员个人用户dao
 */
@WebServlet("/SuperUser")
public class SuperUserServlet extends BaseServlet {
    private SuperUserService superUserService=new SuperUserServiceimpl();

    public void selectItem(HttpServletRequest req, HttpServletResponse resp) {
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("username");
        System.out.println(parameter);
        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Userquery userquery=new Userquery();
            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                userquery.setUsername(parameter);
            }
            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<User> users = superUserService.pagingQuery(userquery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(users);

            //获取表的总条目数
            long total = superUserService.getTocal(userquery);
            System.out.println(total);
            if (users != null && users.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", users);
                /*设置json 传到前台*/
                Gson gson = new Gson();
                /*处理数据 转成json*/
                String s = gson.toJson(returnMap);
                try {
                    /*转发前台*/
                    resp.getWriter().write(s);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public void addItem(HttpServletRequest req, HttpServletResponse resp) {

    }

    public void deleteItem(HttpServletRequest req, HttpServletResponse resp) {
        String parameter = req.getParameter("userid");
        System.out.println(parameter);
        int add = superUserService.delete(Integer.valueOf(parameter));
        System.out.println(add);
        if (add>0){
            HashMap<String, Object> returnMap = new HashMap<>();
            //状态码
            returnMap.put("code",200);
            Gson gson = new Gson();
            /*处理数据 转成json*/
            String s = gson.toJson(returnMap);
            try {
                /*转发前台*/
                resp.getWriter().write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void updateItem(HttpServletRequest req, HttpServletResponse resp) {
        User user=new User();
        String parameter = req.getParameter("username");
        String parameter1 = req.getParameter("userpass");
        String parameter2 = req.getParameter("userid");
        System.out.println(parameter+parameter1+parameter2);
        user.setUsername(parameter);
        user.setUserpass(parameter1);
        user.setUserid(Integer.valueOf(parameter2));

        int update = superUserService.update(user);
        System.out.println(update);
        if (update>0){
            HashMap<String, Object> returnMap = new HashMap<>();
            //状态码
            returnMap.put("code",200);
            Gson gson = new Gson();
            /*处理数据 转成json*/
            String s = gson.toJson(returnMap);
            try {
                /*转发前台*/
                resp.getWriter().write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

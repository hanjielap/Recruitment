package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.dao.SuperNewDao;
import com.hanjie.entity.Affiche;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Affichequery;
import com.hanjie.entity.query.Enterquery;
import com.hanjie.service.SuperNewService;
import com.hanjie.service.impl.SuperNewServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


/**
 * 管理员新闻公告dao
 */
@WebServlet("/SuperNew")
public class SuperNewServlet extends BaseServlet {
    private SuperNewService superNewService=new SuperNewServiceimpl();

    public void selectItem(HttpServletRequest req, HttpServletResponse resp) {
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String affichetitle = req.getParameter("affichetitle");

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Affichequery affichequery=new Affichequery();
            //判断条件是否为空  新建条件model
            if (affichetitle != null && !"".equals(affichetitle)) {
                //将条件设置进去
                affichequery.setAffichetitle(affichetitle);
            }


            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<Affiche> affiches = superNewService.pagingQuery(affichequery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(affiches);

            //获取表的总条目数
            long total = superNewService.getTocal(affichequery);
            System.out.println(total);
            if (affiches != null && affiches.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", affiches);
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
        Affiche affiche=new Affiche();
        String parameter = req.getParameter("affichetitle");
        System.out.println(parameter);
        affiche.setAffichetitle(parameter);
        int add = superNewService.add(affiche);
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

    public void deleteItem(HttpServletRequest req, HttpServletResponse resp) {
        String parameter = req.getParameter("afficheid");
        System.out.println(parameter);
        int add = superNewService.delete(Integer.valueOf(parameter));
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
        Affiche affiche=new Affiche();
        String parameter = req.getParameter("affichetitle");
        String parameter1 = req.getParameter("afficheid");
        System.out.println(parameter);
        affiche.setAffichetitle(parameter);
        affiche.setAfficheid(Integer.valueOf(parameter1));

        int update = superNewService.update(affiche);
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

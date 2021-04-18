package com.hanjie.servlet;


import com.google.gson.Gson;
import com.hanjie.dao.SuperEnterDao;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Enterquery;
import com.hanjie.service.SuperEnterService;
import com.hanjie.service.impl.SuperEnterServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 管理员企业dao
 */
@WebServlet("/SuperEnter")
public class SuperEnterServlet extends BaseServlet {
    private SuperEnterService superEnterService=new SuperEnterServiceimpl();

    public void selectItem(HttpServletRequest req, HttpServletResponse resp) {
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String enterprisename = req.getParameter("enterprisename");
        String enterprisephone = req.getParameter("enterprisephone");
        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Enterquery enterquery = new Enterquery();
            //判断条件是否为空  新建条件model
            if (enterprisename != null && !"".equals(enterprisename)) {
                //将条件设置进去
                enterquery.setEnterprisename(enterprisename);
            }
            if (enterprisephone != null && !"".equals(enterprisephone)) {
                enterquery.setEnterprisephone(enterprisephone);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<Enterprise> enterprises = superEnterService.pagingQuery(enterquery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(enterprises);

            //获取表的总条目数
            long total = superEnterService.getTocal(enterquery);
            System.out.println(total);
            if (enterprises != null && enterprises.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", enterprises);
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


    public void deleteItem(HttpServletRequest req, HttpServletResponse resp) {
        String parameter = req.getParameter("enterpriseid");
        System.out.println(parameter);
        int add = superEnterService.delete(Integer.valueOf(parameter));
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
        Enterprise enterprise=new Enterprise();
        String parameter = req.getParameter("enterpriselogname");
        String parameter1 = req.getParameter("enterpriselogpass");
        String parameter2 = req.getParameter("enterprisename");
        String parameter3 = req.getParameter("enterprisesite");
        String parameter4 = req.getParameter("enterpriseinte");
        String parameter5 = req.getParameter("enterprisephone");
        String parameter6 = req.getParameter("enterpriseid");
        System.out.println(parameter+" : "+parameter1+" : "+parameter2+" : "+parameter3+" : "+parameter4+" : "+parameter5+" : "+parameter6);
        enterprise.setEnterpriselogname(parameter);
        enterprise.setEnterpriselogpass(parameter1);
        enterprise.setEnterprisename(parameter2);
        enterprise.setEnterprisesite(parameter3);
        enterprise.setEnterpriseinte(parameter4);
        enterprise.setEnterprisephone(parameter5);
        enterprise.setEnterpriseid(Integer.valueOf(parameter6));

        int update = superEnterService.update(enterprise);
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

package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.dao.LoginDao;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.Superuser;
import com.hanjie.entity.User;
import com.hanjie.service.LoginService;
import com.hanjie.service.impl.LoginServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 登录dao
 */
@WebServlet("/Login")
public class LoginServlet extends BaseServlet {
    private LoginService loginService=new LoginServiceimpl();

    //分级登录
    public void selectItem(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        User user=new User();
        Enterprise enterprise=new Enterprise();
        Superuser superuser=new Superuser();
        String parameter = req.getParameter("username");
        String parameter1 = req.getParameter("userpass");
        System.out.println(parameter+" : "+parameter1);
        user.setUsername(parameter);
        user.setUserpass(parameter1);
        enterprise.setEnterpriselogname(parameter);
        enterprise.setEnterpriselogpass(parameter1);
        superuser.setSuperusername(parameter);
        superuser.setSuperuserpass(parameter1);

        List<User> users = loginService.userLogin(user);

        List<Enterprise> enterprises = loginService.enterLogin(enterprise);
        List<Superuser> superusers = loginService.superLogin(superuser);
        HttpSession session = req.getSession();
        //遍历取个人id
        System.out.println(users);
        Integer userid=0;
        for (User user1 : users) {
            userid = user1.getUserid();
        }
        System.out.println(userid);

        //遍历取企业id
        System.out.println(enterprises);
        Integer enterpriseid=0;
        for (Enterprise enterpris : enterprises) {
            enterpriseid = enterpris.getEnterpriseid();
        }
        System.out.println("当前企业id：  "+enterpriseid);

        if (users!=null &&!"".equals(users) && users.size()>0){
            session.setAttribute("file",1); //登录过滤
            session.setAttribute("user",users);
            session.setAttribute("userid",userid);
            System.out.println(session.getAttribute("user"));
            System.out.println("Session中个人id：    "+session.getAttribute("userid"));

            HashMap<String, Object> returnMap = new HashMap<>();
            //状态码
            returnMap.put("code",200);
            returnMap.put("power",1);
            returnMap.put("dataList",users);
            Gson gson = new Gson();
            /*处理数据 转成json*/
            String s = gson.toJson(returnMap);
            try {
                /*转发前台*/
                resp.getWriter().write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }else if (enterprises!=null &&!"".equals(enterprises) && enterprises.size()>0){
            session.setAttribute("file",1); //登录过滤
            session.setAttribute("enterprises",enterprises);
            session.setAttribute("enterid",enterpriseid);
            System.out.println(session.getAttribute("enterprises"));
            System.out.println("Session中企业id：   "+session.getAttribute("enterid"));
            HashMap<String, Object> returnMap = new HashMap<>();
            //状态码
            returnMap.put("code",200);
            returnMap.put("power",2);
            returnMap.put("dataList",enterprises);
            Gson gson = new Gson();
            /*处理数据 转成json*/
            String s = gson.toJson(returnMap);
            try {
                /*转发前台*/
                resp.getWriter().write(s);
            } catch (IOException e) {
                e.printStackTrace();
            }


        }else if (superusers!=null &&!"".equals(superusers)  && superusers.size()>0){
            session.setAttribute("file",1); //登录过滤
            session.setAttribute("superusers",superusers);
            System.out.println(session.getAttribute("superusers"));

            HashMap<String, Object> returnMap = new HashMap<>();
            //状态码
            returnMap.put("code",200);
            returnMap.put("power",3);
            returnMap.put("dataList",superusers);
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



    //修改个人密码
    public void updeteUser(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        User user=new User();
        String parameter = req.getParameter("userpass");
        Object userid = session.getAttribute("userid");
        System.out.println(parameter);
        user.setUserpass(parameter);
        user.setUserid((Integer) userid);
        int update = loginService.updateUser(user);
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

    //修改企业密码
    public void updeteEnter(HttpServletRequest req, HttpServletResponse resp) {
        Enterprise enterprise=new Enterprise();
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");
        String parameter = req.getParameter("enterpriselogpass");
        enterprise.setEnterpriseid((Integer) enterid);
        enterprise.setEnterpriselogpass(parameter);
        int update = loginService.updateEnter(enterprise);
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
    //个人注册
    public void addUser(HttpServletRequest req, HttpServletResponse resp) {
        User user=new User();
        String parameter = req.getParameter("username");
        String parameter1 = req.getParameter("userpass");
        System.out.println(parameter+"  "+parameter1);
        user.setUsername(parameter);
        user.setUserpass(parameter1);
        int update = loginService.addUser(user);
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

    //企业注册
    public void addEnter(HttpServletRequest req, HttpServletResponse resp) {
        Enterprise enterprise=new Enterprise();
        String parameter = req.getParameter("enterpriselogname");
        String parameter1 = req.getParameter("enterpriselogpass");
        String parameter2 = req.getParameter("enterprisename");
        String parameter3 = req.getParameter("enterprisesite");
        String parameter4 = req.getParameter("enterpriseinte");
        String parameter5 = req.getParameter("enterprisephone");
        System.out.println(parameter+" :  "+parameter1+"  :  "+parameter2+" :  "+parameter3+" :  "+parameter4+" :  "+parameter5);
        enterprise.setEnterpriselogname(parameter);
        enterprise.setEnterpriselogpass(parameter1);
        enterprise.setEnterprisename(parameter2);
        enterprise.setEnterprisesite(parameter3);
        enterprise.setEnterpriseinte(parameter4);
        enterprise.setEnterprisephone(parameter5);
        int update = loginService.addEnter(enterprise);
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

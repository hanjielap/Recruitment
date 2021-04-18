package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.dao.EnterDao;
import com.hanjie.entity.EnterResume;
import com.hanjie.entity.EnterResumes;
import com.hanjie.entity.Job;
import com.hanjie.entity.Resumeprivate;
import com.hanjie.entity.query.Eamilquery;
import com.hanjie.entity.query.Eamilquerys;
import com.hanjie.service.EnterService;
import com.hanjie.service.impl.EnterServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 企业管理
 */
@WebServlet("/Enter")
public class EnterServlet extends BaseServlet {
    private EnterService enterService=new EnterServiceimpl();

    /**
     *简历没通过显示
     */
    public void selectItem(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");
        System.out.println("当前企业id    ：  "+enterid);
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("jobname");
        String parameter1 = req.getParameter("resumename");
        String parameter2 = req.getParameter("resumeeducation");
        System.out.println(parameter+"   :   "+parameter1+"   :   "+parameter2);

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Eamilquery  eamilquery= new Eamilquery();
            //设置以当前Session的对象id为条件
            eamilquery.setEnterpriseid((Integer) enterid);
            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                eamilquery.setJobname(parameter);
            }
            if (parameter1 != null && !"".equals(parameter1)) {
                //将条件设置进去
                eamilquery.setResumename(parameter1);
            }
            if (parameter2 != null && !"".equals(parameter2)) {
                //将条件设置进去
                eamilquery.setResumeeducation(parameter2);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<EnterResume> enterResumes = enterService.pagingQuery(eamilquery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(enterResumes);

            //获取表的总条目数
            long total = enterService.getTocal(eamilquery);
            System.out.println(total);
            if (enterResumes != null && enterResumes.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", enterResumes);
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
    /**
     *简历通过显示
     */
    public void selectItem2(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");
        System.out.println("当前企业id    ：  "+enterid);
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件

        String parameter1 = req.getParameter("resumename");
        String parameter2 = req.getParameter("resumeeducation");
        System.out.println(parameter1+"   :   "+parameter2);

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Eamilquerys eamilquery= new Eamilquerys();
            //设置以当前Session的对象id为条件
            eamilquery.setEnterpriseid((Integer) enterid);
            //判断条件是否为空  新建条件model

            if (parameter1 != null && !"".equals(parameter1)) {
                //将条件设置进去
                eamilquery.setResumename(parameter1);
            }
            if (parameter2 != null && !"".equals(parameter2)) {
                //将条件设置进去
                eamilquery.setResumeeducation(parameter2);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<EnterResumes> enterResumes = enterService.pagingQuerys(eamilquery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(enterResumes);

            //获取表的总条目数
            long total = enterService.getTocals(eamilquery);
            System.out.println(total);
            if (enterResumes != null && enterResumes.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", enterResumes);
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





    /**
     *通过简历
     */
    public void Resumepass(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");
        Resumeprivate resumeprivate=new Resumeprivate();
        String parameter = req.getParameter("resumeid");
        System.out.println("通过简历id   ："+parameter);
        resumeprivate.setEnterpriseid((Integer) enterid);
        resumeprivate.setResumeid(Integer.valueOf(parameter));
        int update = enterService.Resumepass(resumeprivate);
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


    /**
     *发布求职
     */
    public void Addjob(HttpServletRequest req, HttpServletResponse resp){
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");
        Job job=new Job();
        String parameter = req.getParameter("jobtitle");
        String parameter1 = req.getParameter("jobname");
        String parameter2 = req.getParameter("jobinfo");
        System.out.println(parameter+"   :   "+parameter1+"   :   "+parameter2);
        job.setEnterpriseid((Integer) enterid);
        job.setJobtitle(parameter);
        job.setJobname(parameter1);
        job.setJobinfo(parameter2);
        int update = enterService.Addjob(job);
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

    /**
     * 简历通过显示删除
     */

    public void deleteResumePriv(HttpServletRequest req, HttpServletResponse resp){

        String parameter = req.getParameter("resumeprivateid");
        System.out.println("当前通过id   ：  "+parameter);
        int update = enterService.deleteResumePriv(Integer.valueOf(parameter));
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

package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.dao.JobDao;
import com.hanjie.entity.Job;
import com.hanjie.entity.Jobrelease;
import com.hanjie.entity.query.JobqueryId;
import com.hanjie.entity.query.JobqueryItem;
import com.hanjie.service.JobService;
import com.hanjie.service.impl.JobServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * 职位
 */
@WebServlet("/Job")
public class JobServlet extends BaseServlet {
    private JobService jobService=new JobServiceimpl();

    public void selectItem(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");

        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("jobname");

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            JobqueryId jobqueryId=new JobqueryId();
            jobqueryId.setEnterpriseid((Integer) enterid);
            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                jobqueryId.setJobname(parameter);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<Job> jobs = jobService.pagingQuery(jobqueryId, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(jobs);

            //获取表的总条目数
            long total = jobService.getTocal(jobqueryId);
            System.out.println(total);
            if (jobs != null && jobs.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", jobs);
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

    public void selectItem2(HttpServletRequest req, HttpServletResponse resp) {
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("jobreleasename");

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            JobqueryItem jobqueryId=new JobqueryItem();

            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                jobqueryId.setJobreleasename(parameter);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<Jobrelease> jobreleases = jobService.pagingQuerys(jobqueryId, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(jobreleases);

            //获取表的总条目数
            long total = jobService.getTocals(jobqueryId);
            System.out.println(total);
            if (jobreleases != null && jobreleases.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", jobreleases);
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
        int update = jobService.add(job);
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

    public void deleteItem(HttpServletRequest req, HttpServletResponse resp) {

        String parameter = req.getParameter("jobid");
        System.out.println(parameter);
        int add = jobService.delete(Integer.valueOf(parameter));
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
        Job job=new Job();
        HttpSession session = req.getSession();
        Object enterid = session.getAttribute("enterid");
        String parameter = req.getParameter("jobtitle");
        String parameter1 = req.getParameter("jobname");
        String parameter2 = req.getParameter("jobinfo");
        String parameter3 = req.getParameter("jobid");
        System.out.println(parameter+"   "+parameter1+"    "+parameter2);
        job.setEnterpriseid((Integer) enterid);
        job.setJobtitle(parameter);
        job.setJobname(parameter1);
        job.setJobinfo(parameter2);
        job.setJobid(Integer.valueOf(parameter3));
        int update = jobService.update(job);
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

package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.dao.ResumeDao;
import com.hanjie.entity.*;
import com.hanjie.entity.query.Jobquery;
import com.hanjie.entity.query.Jobquerys;
import com.hanjie.service.ResumeService;
import com.hanjie.service.impl.ResumeServiceimpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet("/Resume")
public class ResumeServlet extends BaseServlet {
    private ResumeService resumeService = new ResumeServiceimpl();

    /**
     * 添加简历
     */
    public void resumeAdd(HttpServletRequest req, HttpServletResponse resp) {
        Resume resume = new Resume();
        HttpSession session = req.getSession();
      /*  String parameter1 = req.getParameter("userid");*/
        String parameter2 = req.getParameter("resumename");
        String parameter3 = req.getParameter("resumecard");
        String parameter4 = req.getParameter("resumesex");
        String parameter5 = req.getParameter("resumeage");
        String parameter6 = req.getParameter("resumeplace");
        String parameter7 = req.getParameter("resumeeducation");
        String parameter8 = req.getParameter("resumecollege");
        String parameter9 = req.getParameter("resumespecialty");
        String parameter10 = req.getParameter("resumephone");
        String parameter11 = req.getParameter("resumeemail");
        String parameter12 = req.getParameter("resumeassessment");
        String parameter13 = req.getParameter("resumeskill");
        String parameter14 = req.getParameter("resumeproject");
        System.out.println(parameter2+" : "+parameter3+" : "+parameter4+" : "+parameter5+" : "+parameter6+" : "+parameter7+" : "+parameter8+" : "+parameter9
                +" : "+parameter10+" : "+parameter11+" : "+parameter12+" : "+parameter13+" : "+parameter14);
       /* resume.setUserid(Integer.valueOf(parameter1));*/
        Object userid = session.getAttribute("userid");
        resume.setUserid(Integer.valueOf(Integer.valueOf((Integer) userid)));
        resume.setResumename(parameter2);
        resume.setResumecard(parameter3);
        resume.setResumesex(parameter4);
        resume.setResumeage(Integer.valueOf(parameter5));
        resume.setResumeplace(parameter6);
        resume.setResumeeducation(parameter7);
        resume.setResumecollege(parameter8);
        resume.setResumespecialty(parameter9);
        resume.setResumephone(parameter10);
        resume.setResumeemail(parameter11);
        resume.setResumeassessment(parameter12);
        resume.setResumeskill(parameter13);
        resume.setResumeproject(parameter14);

        int update = resumeService.resumeAdd(resume);
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
     * 查看职位表界面
     */
    public void selectItem(HttpServletRequest req, HttpServletResponse resp) {
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("jobname");
        String parameter1 = req.getParameter("enterprisename");
        System.out.println(parameter+"   :   "+parameter1);

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Jobquery jobquery = new Jobquery();
            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                jobquery.setJobname(parameter);
            }
            if (parameter1 != null && !"".equals(parameter1)) {
                //将条件设置进去
                jobquery.setEnterprisename(parameter1);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<JobEnter> jobs = resumeService.pagingQuery(jobquery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(jobs);

            //获取表的总条目数
            long total = resumeService.getTocal(jobquery);
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

    /**
     * 简历收藏显示
     */
    public void selectItem2(HttpServletRequest req, HttpServletResponse resp) {
        HttpSession session = req.getSession();
        Object userid = session.getAttribute("userid");
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("jobname");
        String parameter1 = req.getParameter("enterprisename");
        System.out.println(parameter+"   :   "+parameter1);

        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);

            //实例化条件model
            Jobquerys jobquerys = new Jobquerys();
            //设置以当前Session的对象id为条件
            jobquerys.setUserid((Integer) userid);
            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                jobquerys.setJobname(parameter);
            }
            if (parameter1 != null && !"".equals(parameter1)) {
                //将条件设置进去
                jobquerys.setEnterprisename(parameter1);
            }


            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<JobPr> jobPrs = resumeService.pagingQuerys(jobquerys, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(jobPrs);

            //获取表的总条目数
            long total = resumeService.getTocals(jobquerys);
            System.out.println(total);
            if (jobPrs != null && jobPrs.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
                //数值
                returnMap.put("dataList", jobPrs);
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
     * 职位收藏
     */
    public void resumepriv(HttpServletRequest req, HttpServletResponse resp) {
        Jobprivate jobprivate=new Jobprivate();
        HttpSession session = req.getSession();
        String parameter = req.getParameter("jobid");
        Object userid = session.getAttribute("userid");
        System.out.println("用户id   "+userid);
        System.out.println("职位id   "+parameter);
        jobprivate.setUserid((Integer) userid);//添加用户id
        jobprivate.setJobid(Integer.valueOf(parameter));//添加职位id
        int update = resumeService.jobprivatepivt(jobprivate);
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
     * 添加投递简历
     */
    public void resumeGo(HttpServletRequest req, HttpServletResponse resp) {
        Resumego resumego = new Resumego();
        HttpSession session = req.getSession();
        Object userid = session.getAttribute("userid");

        System.out.println("用户id投递   ："+userid);

        //根据个人用户id返回简历id
        List<Resume> resumes = resumeService.selectResumid((Integer) userid);
        //遍历List集合 取出简历id
        Integer resumeid=0;
        for (Resume resume : resumes) {
            resumeid = resume.getResumeid();
        }
        System.out.println("简历id:  "+resumeid);

        String parameter = req.getParameter("jobid");
        System.out.println("当前职位id"+parameter);
        resumego.setResumeid(resumeid);
        resumego.setJobid(Integer.valueOf(parameter));
        int update = resumeService.resumeGo(resumego);
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
     * 求职发布
     */
    public void jobreleaseAdd(HttpServletRequest req, HttpServletResponse resp) {
        Jobrelease jobrelease = new Jobrelease();
        String parameter2 = req.getParameter("jobreleasetitle");
        String parameter3 = req.getParameter("jobreleasename");
        String parameter4 = req.getParameter("jobreleaseintrd");
        System.out.println(parameter2+" : "+parameter3+" : "+parameter4);
        jobrelease.setJobreleasetitle(parameter2);
        jobrelease.setJobreleasename(parameter3);
        jobrelease.setJobreleaseintrd(parameter4);
        int update = resumeService.jobreleaseAdd(jobrelease);
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
     * 修改简历
     */
    public void resumeUpdate(HttpServletRequest req, HttpServletResponse resp) {
        Resume resume = new Resume();
        HttpSession session = req.getSession();
        /*  String parameter1 = req.getParameter("userid");*/
        String parameter2 = req.getParameter("resumename");
        String parameter3 = req.getParameter("resumecard");
        String parameter4 = req.getParameter("resumesex");
        String parameter5 = req.getParameter("resumeage");
        String parameter6 = req.getParameter("resumeplace");
        String parameter7 = req.getParameter("resumeeducation");
        String parameter8 = req.getParameter("resumecollege");
        String parameter9 = req.getParameter("resumespecialty");
        String parameter10 = req.getParameter("resumephone");
        String parameter11 = req.getParameter("resumeemail");
        String parameter12 = req.getParameter("resumeassessment");
        String parameter13 = req.getParameter("resumeskill");
        String parameter14 = req.getParameter("resumeproject");
        System.out.println(parameter2+" : "+parameter3+" : "+parameter4+" : "+parameter5+" : "+parameter6+" : "+parameter7+" : "+parameter8+" : "+parameter9
                +" : "+parameter10+" : "+parameter11+" : "+parameter12+" : "+parameter13+" : "+parameter14);
        /* resume.setUserid(Integer.valueOf(parameter1));*/
        resume.setResumename(parameter2);
        resume.setResumecard(parameter3);
        resume.setResumesex(parameter4);
        resume.setResumeage(Integer.valueOf(parameter5));
        resume.setResumeplace(parameter6);
        resume.setResumeeducation(parameter7);
        resume.setResumecollege(parameter8);
        resume.setResumespecialty(parameter9);
        resume.setResumephone(parameter10);
        resume.setResumeemail(parameter11);
        resume.setResumeassessment(parameter12);
        resume.setResumeskill(parameter13);
        resume.setResumeproject(parameter14);
        Object userid = session.getAttribute("userid");
        resume.setUserid(Integer.valueOf(Integer.valueOf((Integer) userid)));

        int update = resumeService.resumeUpdate(resume);
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
     * 我的简历
     */
    public void resumeSelect(HttpServletRequest req, HttpServletResponse resp) {
        Resume resume = new Resume();
        HttpSession session = req.getSession();
        Object userid = session.getAttribute("userid");
        resume.setUserid(Integer.valueOf(Integer.valueOf((Integer) userid)));
        List<Resume> resumes = resumeService.resumeSelect(resume);

        if (resumes != null && resumes.size() > 0) {
            //数值存到HashMap中
            HashMap<String, Object> returnMap = new HashMap<>();
            //状态码
            returnMap.put("code", 200);
            //数值
            returnMap.put("dataList", resumes);
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

package com.hanjie.servlet;

import com.google.gson.Gson;
import com.hanjie.entity.Affiche;
import com.hanjie.entity.Resume;
import com.hanjie.entity.query.Affichequery;
import com.hanjie.entity.query.Resumequery;
import com.hanjie.service.SuperResumeService;
import com.hanjie.service.SuperUserService;
import com.hanjie.service.impl.SuperResumeServiceimpl;
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
@WebServlet("/SuperResume")
public class SuperResumeServlet extends BaseServlet {
    private SuperResumeService superResumeService=new SuperResumeServiceimpl();

    public void selectItem(HttpServletRequest req, HttpServletResponse resp) {
        //通过axios把 参数传过去  获取pageIndex 和PageSize
        String pageIndex = req.getParameter("pageIndex");
        String pageSize = req.getParameter("pageSize");
        //通过axios把 参数传过去  获取查询条件
        String parameter = req.getParameter("resumename");
        String parameter1 = req.getParameter("resumeeducation");
        String parameter2 = req.getParameter("resumecollege");
        System.out.println(parameter+" : "+parameter1+" : "+parameter2);
        /*判断当前行 和当前页数是否为空*/
        if (pageIndex != null && !"".equals(pageIndex) && pageSize != null && !"".equals(pageSize)) {
            System.out.println("当前页：" + pageIndex + " 当前多少行：" + pageSize);
            //实例化条件model
            Resumequery resumequery=new Resumequery();
            //判断条件是否为空  新建条件model
            if (parameter != null && !"".equals(parameter)) {
                //将条件设置进去
                resumequery.setResumename(parameter);
            }
            if (parameter1 != null && !"".equals(parameter1)) {
                //将条件设置进去
                resumequery.setResumeeducation(parameter1);
            }
            if (parameter2 != null && !"".equals(parameter2)) {
                //将条件设置进去
                resumequery.setResumecollege(parameter2);
            }

            //调用带有limt语句的select  将当前页和每页显示行数传过去 以及查询条件
            List<Resume> resumes = superResumeService.pagingQuery(resumequery, Integer.valueOf(pageIndex), Integer.valueOf(pageSize));
            System.out.println(resumes);

            //获取表的总条目数
            long total = superResumeService.getTocal(resumequery);
            System.out.println(total);
            if (resumes != null && resumes.size() > 0) {
                //数值存到HashMap中
                HashMap<String, Object> returnMap = new HashMap<>();
                //状态码
                returnMap.put("code", 200);
                //总条目数
                returnMap.put("total", total);
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

    public void addItem(HttpServletRequest req, HttpServletResponse resp) {

    }

    public void deleteItem(HttpServletRequest req, HttpServletResponse resp) {
        String parameter = req.getParameter("resumeid");
        System.out.println(parameter);
        int add = superResumeService.delete(Integer.valueOf(parameter));
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
        Resume resume=new Resume();
        String parameter = req.getParameter("resumephone");
        String parameter1 = req.getParameter("resumeemail");
        String parameter2 = req.getParameter("resumeassessment");
        String parameter3 = req.getParameter("resumeskill");
        String parameter4 = req.getParameter("resumeproject");
        String parameter5 = req.getParameter("resumeid");
        System.out.println(parameter+parameter1+parameter2+parameter3+parameter4+parameter5);
        resume.setResumephone(parameter);
        resume.setResumeemail(parameter1);
        resume.setResumeassessment(parameter2);
        resume.setResumeskill(parameter3);
        resume.setResumeproject(parameter4);
        resume.setResumeid(Integer.valueOf(parameter5));
        int update = superResumeService.update(resume);
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

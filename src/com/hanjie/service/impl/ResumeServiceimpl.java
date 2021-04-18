package com.hanjie.service.impl;

import com.hanjie.dao.ResumeDao;
import com.hanjie.dao.impl.ResumeDaoimpl;
import com.hanjie.entity.*;
import com.hanjie.entity.query.Jobquery;
import com.hanjie.entity.query.Jobquerys;
import com.hanjie.service.ResumeService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 建立管理
 */
public class ResumeServiceimpl implements ResumeService {
    private ResumeDao resumeDao=new ResumeDaoimpl();

    @Override
    public int resumeAdd(Resume resume) {
        int i=0;
        try {
            i = resumeDao.resumeAdd(resume);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int resumeGo(Resumego resumego) {
        int i=0;
        try {
            i = resumeDao.resumeGo(resumego);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int jobreleaseAdd(Jobrelease jobrelease) {
        int i=0;
        try {
            i = resumeDao.jobreleaseAdd(jobrelease);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public long getTocal(Jobquery jobquery) {
        long tocal=0;
        try {
            tocal = resumeDao.getTocal(jobquery);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tocal;
    }

    @Override
    public List<JobEnter> pagingQuery(Jobquery jobquery, int pageIndex, int pageSize) {
        List<JobEnter> jobs=null;
        try {
            jobs = resumeDao.pagingQuery(jobquery, pageIndex, pageSize);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (jobs!=null){
            return  jobs;
        }else {
            System.out.println("返回数据为空");
        }
        return  jobs;
    }

    @Override
    public List<Resume> selectResumid(int id) {
        List<Resume> resumes=null;
        try {
            resumes = resumeDao.selectResumid(id);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (resumes!=null){
            return  resumes;
        }else {
            System.out.println("返回数据为空");
        }
        return  resumes;

    }

    @Override
    public int jobprivatepivt(Jobprivate jobprivate) {
        int jobprivatepivt=0;
        try {
            jobprivatepivt = resumeDao.jobprivatepivt(jobprivate);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return jobprivatepivt;
    }

    @Override
    public long getTocals(Jobquerys jobquerys) {
        long tocal=0;
        try {
            tocal = resumeDao.getTocals(jobquerys);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tocal;
    }

    @Override
    public List<JobPr> pagingQuerys(Jobquerys jobquerys, int pageIndex, int pageSize) {
        List<JobPr> jobPrs=null;
        try {
            jobPrs = resumeDao.pagingQuerys(jobquerys, pageIndex, pageSize);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (jobPrs!=null){
            return  jobPrs;
        }else {
            System.out.println("返回数据为空");
        }
        return  jobPrs;
    }

    @Override
    public int resumeUpdate(Resume resume) {
        int i=0;
        try {
            i = resumeDao.resumeUpdate(resume);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public List<Resume> resumeSelect(Resume resume) {
        List<Resume> resumes=null;

        try {
            resumes = resumeDao.resumeSelect(resume);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (resumes!=null){
            return  resumes;
        }else {
            System.out.println("返回数据为空");
        }
        return  resumes;
    }
}

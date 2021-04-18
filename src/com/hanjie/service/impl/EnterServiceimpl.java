package com.hanjie.service.impl;

import com.hanjie.dao.EnterDao;
import com.hanjie.dao.impl.EnterDaoimpl;
import com.hanjie.entity.EnterResume;
import com.hanjie.entity.EnterResumes;
import com.hanjie.entity.Job;
import com.hanjie.entity.Resumeprivate;
import com.hanjie.entity.query.Eamilquery;
import com.hanjie.entity.query.Eamilquerys;
import com.hanjie.service.EnterService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 企业管理
 */
public class EnterServiceimpl implements EnterService {
    private EnterDao enterDao=new EnterDaoimpl();

    @Override
    public long getTocal(Eamilquery eamilquery) {
        long tocal=0;
        try {
            tocal = enterDao.getTocal(eamilquery);
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
    public List<EnterResume> pagingQuery(Eamilquery eamilquery, int pageIndex, int pageSize) {
        List<EnterResume> enterResumes=null;
        try {
            enterResumes = enterDao.pagingQuery(eamilquery, pageIndex, pageSize);
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
        if (enterResumes!=null){
            System.out.println(enterResumes);
            return  enterResumes;
        }else {
            System.out.println("返回数据为空");
        }
        return  enterResumes;
    }

    @Override
    public int Resumepass(Resumeprivate resumeprivate) {
        int resumepass=0;
        try {
            resumepass= enterDao.Resumepass(resumeprivate);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return resumepass;
    }

    @Override
    public long getTocals(Eamilquerys eamilquerys) {
        long tocal=0;
        try {
            tocal = enterDao.getTocals(eamilquerys);
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
    public List<EnterResumes> pagingQuerys(Eamilquerys eamilquerys, int pageIndex, int pageSize) {
        List<EnterResumes> enterResumes=null;
        try {
            enterResumes = enterDao.pagingQuerys(eamilquerys, pageIndex, pageSize);
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
        if (enterResumes!=null){
            return  enterResumes;
        }else {
            System.out.println("返回数据为空");
        }
        return  enterResumes;
    }

    @Override
    public int deleteResumePriv(int id) {
        int i=0;
        try {
            i= enterDao.deleteResumePriv(id);
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
    public int Addjob(Job job) {
        int add=0;
        try {
            add= enterDao.Addjob(job);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return add;
    }
}

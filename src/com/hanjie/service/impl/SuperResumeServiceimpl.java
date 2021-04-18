package com.hanjie.service.impl;

import com.hanjie.dao.SuperResumeDao;
import com.hanjie.dao.impl.SuperResumeDaoimpl;
import com.hanjie.entity.Resume;
import com.hanjie.entity.query.Resumequery;
import com.hanjie.service.SuperResumeService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class SuperResumeServiceimpl implements SuperResumeService {
    private SuperResumeDao superResumeDao=new SuperResumeDaoimpl();

    @Override
    public long getTocal(Resumequery resumequery) {
        long tocal=0;
        try {
            tocal = superResumeDao.getTocal(resumequery);
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
    public List<Resume> pagingQuery(Resumequery resumequery, int pageIndex, int pageSize) {
        List<Resume> resumes=null;
        try {
            resumes = superResumeDao.pagingQuery(resumequery, pageIndex, pageSize);
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
    public int add(Resume resume) {
        return 0;
    }

    @Override
    public int update(Resume resume) {
        int update=0;
        try {
            update = superResumeDao.update(resume);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public int delete(int id) {
        int delete=0;
        try {
            delete= superResumeDao.delete(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return delete;
    }

    @Override
    public List<Resume> selectAll() {
        return null;
    }

    @Override
    public List<Resume> selectAllPaping(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<Resume> selectone(int id) {
        return null;
    }

    @Override
    public Resume selectone2(int id) {
        return null;
    }
}

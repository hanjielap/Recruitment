package com.hanjie.service.impl;

import com.hanjie.dao.JobDao;
import com.hanjie.dao.impl.JobDaoimpl;
import com.hanjie.entity.Job;
import com.hanjie.entity.Jobrelease;
import com.hanjie.entity.query.JobqueryId;
import com.hanjie.entity.query.JobqueryItem;
import com.hanjie.service.JobService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 职位
 */
public class JobServiceimpl implements JobService {
    private JobDao jobDao=new JobDaoimpl();

    @Override
    public long getTocal(JobqueryId jobqueryId) {
        long tocal=0;
        try {
            tocal = jobDao.getTocal(jobqueryId);
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
    public List<Job> pagingQuery(JobqueryId jobqueryId, int pageIndex, int pageSize) {
        List<Job> jobs=null;
        try {
            jobs = jobDao.pagingQuery(jobqueryId, pageIndex, pageSize);
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
    public long getTocals(JobqueryItem jobqueryItem) {
        long tocal=0;
        try {
            tocal = jobDao.getTocals(jobqueryItem);
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
    public List<Jobrelease> pagingQuerys(JobqueryItem jobqueryItem, int pageIndex, int pageSize) {
        List<Jobrelease> jobreleases=null;
        try {
            jobreleases = jobDao.pagingQuerys(jobqueryItem, pageIndex, pageSize);
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
        if (jobreleases!=null){
            return  jobreleases;
        }else {
            System.out.println("返回数据为空");
        }
        return  jobreleases;
    }

    @Override
    public int add(Job job) {
        int add=0;
        try {
            add= jobDao.add(job);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return add;
    }

    @Override
    public int update(Job job) {
        int update=0;
        try {
            update = jobDao.update(job);
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
            delete= jobDao.delete(id);
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
    public List<Job> selectAll() {
        return null;
    }

    @Override
    public List<Job> selectAllPaping(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<Job> selectone(int id) {
        return null;
    }

    @Override
    public Job selectone2(int id) {
        return null;
    }
}

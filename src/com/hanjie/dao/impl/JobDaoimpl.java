package com.hanjie.dao.impl;

import com.hanjie.dao.JobDao;
import com.hanjie.entity.Job;
import com.hanjie.entity.Jobrelease;
import com.hanjie.entity.query.JobqueryId;
import com.hanjie.entity.query.JobqueryItem;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 职位
 */
public class JobDaoimpl implements JobDao {


    @Override
    public long getTocal(JobqueryId jobqueryId) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from job ");
        //获得条件
        String name = jobqueryId.getJobname();
        Integer enterpriseid = jobqueryId.getEnterpriseid();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }else {
                sb.append(" where jobname=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        if (enterpriseid!=null &&!"".equals(enterpriseid)){
            if(whereFalg){
                sb.append(" and enterpriseid=? ");
            }else {
                sb.append(" where enterpriseid=? ");
                whereFalg=true;
            }
            pars.add(enterpriseid);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<Job> pagingQuery(JobqueryId jobqueryId, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from job ");
        //获得条件
        String name = jobqueryId.getJobname();
        Integer enterpriseid = jobqueryId.getEnterpriseid();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }else {
                sb.append(" where jobname=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        if (enterpriseid!=null &&!"".equals(enterpriseid)){
            if(whereFalg){
                sb.append(" and enterpriseid=? ");
            }else {
                sb.append(" where enterpriseid=? ");
                whereFalg=true;
            }
            pars.add(enterpriseid);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<Job> jobs = DbUtil.executeQuery(Job.class, sb.toString(), pars.toArray());
        return jobs;
    }

    @Override
    public long getTocals(JobqueryItem jobqueryItem) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from jobrelease ");
        //获得条件
        String name = jobqueryItem.getJobreleasename();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobreleasename=? ");
            }else {
                sb.append(" where jobreleasename=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<Jobrelease> pagingQuerys(JobqueryItem jobqueryItem, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from jobrelease ");
        //获得条件
        String name = jobqueryItem.getJobreleasename();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobreleasename=? ");
            }else {
                sb.append(" where jobreleasename=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<Jobrelease> jobreleases = DbUtil.executeQuery(Jobrelease.class, sb.toString(), pars.toArray());
        return jobreleases;

    }


    @Override
    public int add(Job job) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`job`( `enterpriseid`, `jobtitle`, `jobname`, `jobinfo`, `jobissue`, `jobstate`, `createtime`) VALUES (?, ?, ?, ?, DEFAULT, DEFAULT, now())";
        int i = DbUtil.executeUpdate(sql, job.getEnterpriseid(), job.getJobtitle(), job.getJobname(), job.getJobinfo());
        return i;
    }

    @Override
    public int update(Job job) throws SQLException, IOException, ClassNotFoundException {
       String sql="UPDATE `recruitment`.`job` SET `enterpriseid` = ?, `jobtitle` = ?, `jobname` = ?, `jobinfo` = ?, `jobissue` = DEFAULT, `jobstate` = DEFAULT, `createtime` = NOW() WHERE `jobid` = ?";
        int i = DbUtil.executeUpdate(sql, job.getEnterpriseid(), job.getJobtitle(), job.getJobname(), job.getJobinfo(),job.getJobid());
        return i;
    }

    @Override
    public int delete(int id) throws SQLException, IOException, ClassNotFoundException {
        String sql="DELETE from  job where jobid=?";
        int i = DbUtil.executeUpdate(sql, id);
        return i;
    }

    @Override
    public List<Job> selectAll() throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<Job> selectAllPaping(int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
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

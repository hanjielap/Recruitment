package com.hanjie.dao.impl;

import com.hanjie.dao.ResumeDao;
import com.hanjie.entity.*;
import com.hanjie.entity.query.Jobquery;
import com.hanjie.entity.query.Jobquerys;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResumeDaoimpl implements ResumeDao {

    @Override
    public int resumeAdd(Resume resume) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`resume`" +
                "(`userid`, `resumename`, `resumecard`, `resumesex`, `resumeage`, `resumeplace`, `resumeeducation`," +
                " `resumecollege`, `resumespecialty`, `resumephone`, `resumeemail`, `resumeassessment`, `resumeskill`, `resumeproject`) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";
        int i = DbUtil.executeUpdate(sql, resume.getUserid(), resume.getResumename(), resume.getResumecard(), resume.getResumesex(), resume.getResumeage(),
                resume.getResumeplace(), resume.getResumeeducation(), resume.getResumecollege(), resume.getResumespecialty(), resume.getResumephone(), resume.getResumeemail(),
                resume.getResumeassessment(),resume.getResumeskill(), resume.getResumeproject());
        return i;
    }

    @Override
    public int resumeGo(Resumego resumego) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`resumego`(`resumeid`, `jobid`) VALUES (?,?)";
        int i = DbUtil.executeUpdate(sql, resumego.getResumeid(), resumego.getJobid());
        return i;
    }

    @Override
    public int jobreleaseAdd(Jobrelease jobrelease) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`jobrelease`(`jobreleasetitle`, `jobreleasename`, `jobreleaseintrd`, `jobissue`, `createtime`)" +
                " VALUES (?, ?, ?, DEFAULT, now());";
        int i = DbUtil.executeUpdate(sql, jobrelease.getJobreleasetitle(), jobrelease.getJobreleasename(), jobrelease.getJobreleaseintrd());
        return i;
    }

    @Override
    public long getTocal(Jobquery jobquery) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from job,enterprise where job.enterpriseid=enterprise.enterpriseid ");
        //获得条件
        String name = jobquery.getJobname();
        String enterprisename = jobquery.getEnterprisename();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (enterprisename!=null &&!"".equals(enterprisename)){
            if(whereFalg){
                sb.append(" and enterprisename=? ");
            }
            pars.add(enterprisename);
        }
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }
            pars.add(name);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<JobEnter> pagingQuery(Jobquery jobquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from job,enterprise where job.enterpriseid=enterprise.enterpriseid ");
        //获得条件
        String name = jobquery.getJobname();
        String enterprisename = jobquery.getEnterprisename();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (enterprisename!=null &&!"".equals(enterprisename)){
            if(whereFalg){
                sb.append(" and enterprisename=? ");
            }
            pars.add(enterprisename);
        }
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }
            pars.add(name);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<JobEnter> jobs = DbUtil.executeQuery(JobEnter.class, sb.toString(), pars.toArray());
        return jobs;
    }

    @Override
    public List<Resume> selectResumid(int id) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        String sql="select * from resume where userid=?";
        List<Resume> resumes = DbUtil.executeQuery(Resume.class, sql, id);
        return resumes;
    }

    @Override
    public int jobprivatepivt(Jobprivate jobprivate) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`jobprivate`(`userid`, `jobid`, `resumeprivatestate`, `createtime`) VALUES (?, ?,DEFAULT, now())";
        int i = DbUtil.executeUpdate(sql, jobprivate.getUserid(), jobprivate.getJobid());
        return i;
    }

    @Override
    public long getTocals(Jobquerys jobquerys) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from jobprivate,job,enterprise where jobprivate.jobid=job.jobid and enterprise.enterpriseid=job.enterpriseid ");
        //获得条件
        String name = jobquerys.getJobname();
        String enterprisename = jobquerys.getEnterprisename();
        Integer userid = jobquerys.getUserid();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (enterprisename!=null &&!"".equals(enterprisename)){
            if(whereFalg){
                sb.append(" and enterprisename=? ");
            }
            pars.add(enterprisename);
        }
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }
            pars.add(name);
        }
        if (userid!=null &&!"".equals(userid)){
            if(whereFalg){
                sb.append(" and userid=? ");
            }
            pars.add(userid);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<JobPr> pagingQuerys(Jobquerys jobquerys, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from jobprivate,job,enterprise where jobprivate.jobid=job.jobid and enterprise.enterpriseid=job.enterpriseid ");
        //获得条件
        String name = jobquerys.getJobname();
        String enterprisename = jobquerys.getEnterprisename();
        Integer userid = jobquerys.getUserid();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (enterprisename!=null &&!"".equals(enterprisename)){
            if(whereFalg){
                sb.append(" and enterprisename=? ");
            }
            pars.add(enterprisename);
        }
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }
            pars.add(name);
        }
        if (userid!=null &&!"".equals(userid)){
            if(whereFalg){
                sb.append(" and userid=? ");
            }
            pars.add(userid);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<JobPr> jobPrs = DbUtil.executeQuery(JobPr.class, sb.toString(), pars.toArray());
        return jobPrs;
    }





    @Override
    public int resumeUpdate(Resume resume) throws SQLException, IOException, ClassNotFoundException {
        String sql="UPDATE `recruitment`.`resume` SET  `resumename` = ?, `resumecard` = ?, `resumesex` = ?, `resumeage` = ?, `resumeplace` =?, `resumeeducation` = ?, `resumecollege` = ?, `resumespecialty` = ?, `resumephone` = ?, `resumeemail` = ?, `resumeassessment` = ?, `resumeskill` = ?, `resumeproject` = ? WHERE `userid` = 1;";
        int i = DbUtil.executeUpdate(sql, resume.getResumename(), resume.getResumecard(), resume.getResumesex(), resume.getResumeage(),
                resume.getResumeplace(), resume.getResumeeducation(), resume.getResumecollege(), resume.getResumespecialty(), resume.getResumephone(), resume.getResumeemail(),
                resume.getResumeassessment(),resume.getResumeskill(), resume.getResumeproject(),resume.getUserid());
        return i;

    }

    @Override
    public List<Resume> resumeSelect(Resume resume) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        String sql="select * from resume where userid=?";
        List<Resume> resumes = DbUtil.executeQuery(Resume.class, sql, resume.getUserid());
        return resumes;
    }
}

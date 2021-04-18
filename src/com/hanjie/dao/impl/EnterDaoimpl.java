package com.hanjie.dao.impl;

import com.hanjie.dao.EnterDao;
import com.hanjie.entity.EnterResume;
import com.hanjie.entity.EnterResumes;
import com.hanjie.entity.Job;
import com.hanjie.entity.Resumeprivate;
import com.hanjie.entity.query.Eamilquery;
import com.hanjie.entity.query.Eamilquerys;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 企业管理
 */
public class EnterDaoimpl  implements EnterDao {

    @Override
    public long getTocal(Eamilquery eamilquery) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from resumego,resume,job,enterprise where resumego.jobid=job.jobid and  resume.resumeid=resumego.resumeid and enterprise.enterpriseid=job.enterpriseid ");
        //获得条件
        String jobname = eamilquery.getJobname();
        String resumename = eamilquery.getResumename();
        String resumeeducation = eamilquery.getResumeeducation();
        Integer enterpriseid = eamilquery.getEnterpriseid();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (jobname!=null &&!"".equals(jobname)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }
            pars.add(jobname);
        }
        if (resumename!=null &&!"".equals(resumename)){
            if(whereFalg){
                sb.append(" and resumename=? ");
            }
            pars.add(resumename);
        }
        if (resumeeducation!=null &&!"".equals(resumeeducation)){
            if(whereFalg){
                sb.append(" and resumeeducation=? ");
            }
            pars.add(resumeeducation);
        }
        if (enterpriseid!=null &&!"".equals(enterpriseid)){
            if(whereFalg){
                sb.append(" and enterprise.enterpriseid=? ");
            }
            pars.add(enterpriseid);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<EnterResume> pagingQuery(Eamilquery eamilquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from resumego,resume,job,enterprise where resumego.jobid=job.jobid and  resume.resumeid=resumego.resumeid and enterprise.enterpriseid=job.enterpriseid ");
        //获得条件
        String jobname = eamilquery.getJobname();
        String resumename = eamilquery.getResumename();
        String resumeeducation = eamilquery.getResumeeducation();
        Integer enterpriseid = eamilquery.getEnterpriseid();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (jobname!=null &&!"".equals(jobname)){
            if(whereFalg){
                sb.append(" and jobname=? ");
            }
            pars.add(jobname);
        }
        if (resumename!=null &&!"".equals(resumename)){
            if(whereFalg){
                sb.append(" and resumename=? ");
            }
            pars.add(resumename);
        }
        if (resumeeducation!=null &&!"".equals(resumeeducation)){
            if(whereFalg){
                sb.append(" and resumeeducation=? ");
            }
            pars.add(resumeeducation);
        }
        if (enterpriseid!=null &&!"".equals(enterpriseid)){
            if(whereFalg){
                sb.append(" and enterprise.enterpriseid=? ");
            }
            pars.add(enterpriseid);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        System.out.println(jobname+"   "+resumename+"   "+resumeeducation+"   "+enterpriseid+"   "+pageIndex+"   "+pageSize);
        List<EnterResume> enterResumes = DbUtil.executeQuery(EnterResume.class, sb.toString(), pars.toArray());
        System.out.println(enterResumes);
        return enterResumes;
    }


    @Override
    public int Resumepass(Resumeprivate resumeprivate) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`resumeprivate`(`enterpriseid`, `resumeid`, `resumeprivatestate`, `createtime`) VALUES (?, ?, DEFAULT, now())";
        int i = DbUtil.executeUpdate(sql, resumeprivate.getEnterpriseid(), resumeprivate.getResumeid());
        return i;
    }

    @Override
    public long getTocals(Eamilquerys eamilquerys) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from resumeprivate,resume,enterprise where resume.resumeid=resumeprivate.resumeid and  enterprise.enterpriseid=resumeprivate.enterpriseid ");
        //获得条件
        String resumename = eamilquerys.getResumename();
        String resumeeducation = eamilquerys.getResumeeducation();
        Integer enterpriseid = eamilquerys.getEnterpriseid();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (resumename!=null &&!"".equals(resumename)){
            if(whereFalg){
                sb.append(" and resumename=? ");
            }
            pars.add(resumename);
        }
        if (resumeeducation!=null &&!"".equals(resumeeducation)){
            if(whereFalg){
                sb.append(" and resumeeducation=? ");
            }
            pars.add(resumeeducation);
        }
        if (enterpriseid!=null &&!"".equals(enterpriseid)){
            if(whereFalg){
                sb.append(" and enterprise.enterpriseid=? ");
            }
            pars.add(enterpriseid);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<EnterResumes> pagingQuerys(Eamilquerys eamilquerys, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder("  select * from resumeprivate,resume,enterprise where resume.resumeid=resumeprivate.resumeid and  enterprise.enterpriseid=resumeprivate.enterpriseid ");
        //获得条件
        String resumename = eamilquerys.getResumename();
        String resumeeducation = eamilquerys.getResumeeducation();
        Integer enterpriseid = eamilquerys.getEnterpriseid();
        //判断是否加where
        boolean whereFalg=true;
        ArrayList<Object> pars = new ArrayList<>();
        if (resumename!=null &&!"".equals(resumename)){
            if(whereFalg){
                sb.append(" and resumename=? ");
            }
            pars.add(resumename);
        }
        if (resumeeducation!=null &&!"".equals(resumeeducation)){
            if(whereFalg){
                sb.append(" and resumeeducation=? ");
            }
            pars.add(resumeeducation);
        }
        if (enterpriseid!=null &&!"".equals(enterpriseid)){
            if(whereFalg){
                sb.append(" and enterprise.enterpriseid=? ");
            }
            pars.add(enterpriseid);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<EnterResumes> enterResumes = DbUtil.executeQuery(EnterResumes.class, sb.toString(), pars.toArray());
        return enterResumes;
    }

    @Override
    public int deleteResumePriv(int id) throws SQLException, IOException, ClassNotFoundException {
        String sql="DELETE from  resumeprivate where resumeprivateid=?";
        int i = DbUtil.executeUpdate(sql, id);
        return i;
    }

    @Override
    public int Addjob(Job job) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`job`( `enterpriseid`, `jobtitle`, `jobname`, `jobinfo`, `jobissue`, `jobstate`, `createtime`) VALUES (?, ?, ?, ?, DEFAULT, DEFAULT, now())";
        int i = DbUtil.executeUpdate(sql, job.getEnterpriseid(), job.getJobtitle(), job.getJobname(), job.getJobinfo());
        return i;
    }
}

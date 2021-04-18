package com.hanjie.dao.impl;


import com.hanjie.dao.SuperEnterDao;
import com.hanjie.dao.SuperResumeDao;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.Resume;
import com.hanjie.entity.query.Enterquery;
import com.hanjie.entity.query.Resumequery;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理员企业dao
 */
public class SuperResumeDaoimpl implements SuperResumeDao {


    @Override
    public long getTocal(Resumequery resumequery) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from resume ");
        //获得条件
        String name = resumequery.getResumename();
        String phone = resumequery.getResumeeducation();
        String resumecollege = resumequery.getResumecollege();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and resumename=? ");
            }else {
                sb.append(" where resumename=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        if (phone!=null &&!"".equals(phone)){
            if(whereFalg){
                sb.append(" and resumeeducation=? ");
            }else {
                sb.append(" where resumeeducation=? ");
                whereFalg=true;
            }
            pars.add(phone);
        }
        if (resumecollege!=null &&!"".equals(resumecollege)){
            if(whereFalg){
                sb.append(" and resumecollege=? ");
            }else {
                sb.append(" where resumecollege=? ");
                whereFalg=true;
            }
            pars.add(resumecollege);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<Resume> pagingQuery(Resumequery resumequery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from resume ");
        //获得条件
        String name = resumequery.getResumename();
        String phone = resumequery.getResumeeducation();
        String resumecollege = resumequery.getResumecollege();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and resumename=? ");
            }else {
                sb.append(" where resumename=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        if (phone!=null &&!"".equals(phone)){
            if(whereFalg){
                sb.append(" and resumeeducation=? ");
            }else {
                sb.append(" where resumeeducation=? ");
                whereFalg=true;
            }
            pars.add(phone);
        }
        if (resumecollege!=null &&!"".equals(resumecollege)){
            if(whereFalg){
                sb.append(" and resumecollege=? ");
            }else {
                sb.append(" where resumecollege=? ");
                whereFalg=true;
            }
            pars.add(resumecollege);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<Resume> resumes = DbUtil.executeQuery(Resume.class, sb.toString(), pars.toArray());
        return resumes;
    }

    @Override
    public int add(Resume resume) throws SQLException, IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public int update(Resume resume) throws SQLException, IOException, ClassNotFoundException {
        String sql="UPDATE `recruitment`.`resume` SET  `resumephone` = ?, `resumeemail` = ?, `resumeassessment` = ?, `resumeskill` = ?, `resumeproject` = ? WHERE `resumeid` = ?;";
        int i = DbUtil.executeUpdate(sql, resume.getResumephone(), resume.getResumeemail(), resume.getResumeassessment(), resume.getResumeskill(), resume.getResumeproject(), resume.getResumeid());
        return i;
    }

    @Override
    public int delete(int id) throws SQLException, IOException, ClassNotFoundException {
        String sql="DELETE from  resume where resumeid=?";
        int i = DbUtil.executeUpdate(sql, id);
        return i;
    }

    @Override
    public List<Resume> selectAll() throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<Resume> selectAllPaping(int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
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

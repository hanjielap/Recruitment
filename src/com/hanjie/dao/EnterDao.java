package com.hanjie.dao;

import com.hanjie.entity.EnterResume;
import com.hanjie.entity.EnterResumes;
import com.hanjie.entity.Job;
import com.hanjie.entity.Resumeprivate;
import com.hanjie.entity.query.Eamilquery;
import com.hanjie.entity.query.Eamilquerys;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 企业管理dao
 */
public interface EnterDao {
    /**
     * 简历邮箱查看
     */
    long getTocal(Eamilquery eamilquery) throws SQLException, IOException, ClassNotFoundException;
    List<EnterResume> pagingQuery(Eamilquery eamilquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;

    /**
     * 通过简历
     */
    int Resumepass(Resumeprivate resumeprivate) throws SQLException, IOException, ClassNotFoundException;


    /**
     * 收藏简历查看
     */
    long getTocals(Eamilquerys eamilquerys) throws SQLException, IOException, ClassNotFoundException;
    List<EnterResumes> pagingQuerys(Eamilquerys eamilquerys, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;

    /**
     * 收藏通过简历删除
     */
    int deleteResumePriv(int id) throws SQLException, IOException, ClassNotFoundException;


    /**
     * 发布求职
     */
    int Addjob(Job job) throws SQLException, IOException, ClassNotFoundException;
}

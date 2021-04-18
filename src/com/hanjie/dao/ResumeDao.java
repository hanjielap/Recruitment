package com.hanjie.dao;

import com.hanjie.entity.*;
import com.hanjie.entity.query.Jobquery;
import com.hanjie.entity.query.Jobquerys;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 简历dao
 */
public interface ResumeDao {
    /**
     * 完善简历 添加简历
     */
    int resumeAdd(Resume resume) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 投递简历
     */
    int resumeGo(Resumego resumego) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 发布求职
     */
    int jobreleaseAdd(Jobrelease jobrelease) throws SQLException, IOException, ClassNotFoundException;


    /**
     *条件tocal  投递简历
     */
    long getTocal(Jobquery jobquery) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 多条件查询 分页  投递简历
     */
    List<JobEnter> pagingQuery(Jobquery jobquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;


    /**
     * 根据用户id返回简历id
     */
    List<Resume> selectResumid(int id) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;



    /**
     * 职位收藏
     */
    int jobprivatepivt(Jobprivate jobprivate) throws SQLException, IOException, ClassNotFoundException;


    /**
     * getTocal 简历收藏显示
     */

    long getTocals(Jobquerys jobquerys) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 多条件查询 分页  投递简历  简历收藏显示
     */
    List<JobPr> pagingQuerys(Jobquerys jobquerys, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;


    /**
     * 修改简历
     */
    int resumeUpdate(Resume resume) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 我的简历
     */
    List<Resume> resumeSelect(Resume resume) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
}

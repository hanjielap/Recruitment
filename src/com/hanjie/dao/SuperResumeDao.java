package com.hanjie.dao;

import com.hanjie.entity.Resume;
import com.hanjie.entity.User;
import com.hanjie.entity.query.Resumequery;
import com.hanjie.entity.query.Userquery;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员个人用户dao
 */
public interface SuperResumeDao extends BaseDao<Resume>{
    /**
     *条件tocal
     */
    long getTocal(Resumequery resumequery) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 多条件查询 分页
     */
    List<Resume> pagingQuery(Resumequery resumequery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
}

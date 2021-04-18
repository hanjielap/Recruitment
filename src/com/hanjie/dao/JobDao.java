package com.hanjie.dao;

import com.hanjie.entity.Job;
import com.hanjie.entity.Jobrelease;
import com.hanjie.entity.query.JobqueryId;
import com.hanjie.entity.query.JobqueryItem;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface JobDao extends BaseDao<Job>{


    /**
     * 当前企业职位查看 以及 分页
     */
    long getTocal(JobqueryId jobqueryId) throws SQLException, IOException, ClassNotFoundException;
    List<Job> pagingQuery(JobqueryId jobqueryId, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;


    /**
     * 主页求职查看
     */
    long getTocals(JobqueryItem jobqueryItem) throws SQLException, IOException, ClassNotFoundException;
    /**
     * 主页求职查看
     */
    List<Jobrelease> pagingQuerys(JobqueryItem jobqueryItem, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;

}

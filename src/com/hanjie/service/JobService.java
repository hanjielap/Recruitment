package com.hanjie.service;

import com.hanjie.entity.Job;
import com.hanjie.entity.Jobrelease;
import com.hanjie.entity.query.JobqueryId;
import com.hanjie.entity.query.JobqueryItem;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface JobService extends BaseService<Job>{
    /**
     * 当前企业职位查看 以及 分页
     */
    long getTocal(JobqueryId jobqueryId);
    List<Job> pagingQuery(JobqueryId jobqueryId, int pageIndex, int pageSize);

    /**
     * 主页求职查看
     */
    long getTocals(JobqueryItem jobqueryItem) ;
    /**
     * 主页求职查看
     */
    List<Jobrelease> pagingQuerys(JobqueryItem jobqueryItem, int pageIndex, int pageSize);
}

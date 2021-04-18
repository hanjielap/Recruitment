package com.hanjie.service;

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
public interface EnterService {

    /**
     * 简历邮箱查看
     */
    long getTocal(Eamilquery eamilquery);
    List<EnterResume> pagingQuery(Eamilquery eamilquery, int pageIndex, int pageSize) ;

    /**
     * 通过简历
     */
    int Resumepass(Resumeprivate resumeprivate) ;


    /**
     * 收藏简历查看
     */
    long getTocals(Eamilquerys eamilquerys) ;
    List<EnterResumes> pagingQuerys(Eamilquerys eamilquerys, int pageIndex, int pageSize) ;

    /**
     * 收藏通过简历删除
     */
    int deleteResumePriv(int id);

    /**
     * 发布求职
     */
    int Addjob(Job job) ;
}

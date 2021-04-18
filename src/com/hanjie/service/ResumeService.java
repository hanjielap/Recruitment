package com.hanjie.service;

import com.hanjie.entity.*;
import com.hanjie.entity.query.Jobquery;
import com.hanjie.entity.query.Jobquerys;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * 简历dao
 */
public interface ResumeService {
    /**
     * 完善简历 添加简历
     */
    int resumeAdd(Resume resume);

    /**
     * 投递简历
     */
    int resumeGo(Resumego resumego);

    /**
     * 发布求职
     */
    int jobreleaseAdd(Jobrelease jobrelease);

    /**
     *条件tocal
     */
    long getTocal(Jobquery jobquery);

    /**
     * 多条件查询 分页
     */
    List<JobEnter> pagingQuery(Jobquery jobquery, int pageIndex, int pageSize);

    /**
     * 根据用户id返回简历id
     */
    List<Resume> selectResumid(int id);

    /**
     * 职位收藏
     */
    int jobprivatepivt(Jobprivate jobprivate);

    /**
     * getTocal 简历收藏显示
     */

    long getTocals(Jobquerys jobquerys);

    /**
     * 多条件查询 分页  投递简历  简历收藏显示
     */
    List<JobPr> pagingQuerys(Jobquerys jobquerys, int pageIndex, int pageSize);
    /**
     * 修改简历
     */
    int resumeUpdate(Resume resume);

    /**
     * 我的简历
     */
    List<Resume> resumeSelect(Resume resume);
}

package com.hanjie.service;

import com.hanjie.entity.Resume;
import com.hanjie.entity.query.Resumequery;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface SuperResumeService extends BaseService<Resume> {
    /**
     *条件tocal
     */
    long getTocal(Resumequery resumequery) ;

    /**
     * 多条件查询 分页
     */
    List<Resume> pagingQuery(Resumequery resumequery, int pageIndex, int pageSize);
}

package com.hanjie.service;

import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Enterquery;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员企业dao
 */
public interface SuperEnterService  extends BaseService<Enterprise>{
    /**
     *条件tocal
     */
    long getTocal(Enterquery enterquery);

    /**
     * 多条件查询 分页
     */
    List<Enterprise> pagingQuery(Enterquery enterquery, int pageIndex, int pageSize);
}

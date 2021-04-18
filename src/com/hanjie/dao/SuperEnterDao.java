package com.hanjie.dao;

import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Enterquery;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员企业dao
 */
public interface SuperEnterDao extends BaseDao<Enterprise>{

    /**
     *条件tocal
     */
    long getTocal(Enterquery enterquery) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 多条件查询 分页
     */
    List<Enterprise> pagingQuery(Enterquery enterquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
}

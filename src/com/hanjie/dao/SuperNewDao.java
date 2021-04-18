package com.hanjie.dao;

import com.hanjie.entity.Affiche;
import com.hanjie.entity.query.Affichequery;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员新闻公告dao
 */
public interface SuperNewDao extends BaseDao<Affiche>{
    /**
     *条件tocal
     */
    long getTocal(Affichequery affichequery) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 多条件查询 分页
     */
    List<Affiche> pagingQuery(Affichequery affichequery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
}

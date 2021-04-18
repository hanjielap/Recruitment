package com.hanjie.service;

import com.hanjie.entity.Affiche;
import com.hanjie.entity.query.Affichequery;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员新闻公告dao
 */
public interface SuperNewService extends BaseService<Affiche>{
    /**
     *条件tocal
     */
    long getTocal(Affichequery affichequery) ;

    /**
     * 多条件查询 分页
     */
    List<Affiche> pagingQuery(Affichequery affichequery, int pageIndex, int pageSize);
}

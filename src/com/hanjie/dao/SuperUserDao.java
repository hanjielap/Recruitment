package com.hanjie.dao;

import com.hanjie.entity.User;
import com.hanjie.entity.query.Userquery;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员个人用户dao
 */
public interface SuperUserDao extends BaseDao<User>{
    /**
     *条件tocal
     */
    long getTocal(Userquery userquery) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 多条件查询 分页
     */
    List<User> pagingQuery(Userquery userquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
}

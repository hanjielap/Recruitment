package com.hanjie.service;

import com.hanjie.entity.User;
import com.hanjie.entity.query.Userquery;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员个人用户dao
 */
public interface SuperUserService  extends BaseService<User>{
    /**
     *条件tocal
     */
    long getTocal(Userquery userquery);

    /**
     * 多条件查询 分页
     */
    List<User> pagingQuery(Userquery userquery, int pageIndex, int pageSize);
}

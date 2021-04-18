package com.hanjie.service;

import java.util.List;

public interface BaseService<T> {

    ///添加方法
    int add(T t) ;
    //修改方法
    int update(T t);
    //删除方法
    int delete(int id);

    //查询所有方法
    List<T> selectAll();
    //查询所有数据方法 分页
    List<T> selectAllPaping(int pageIndex, int pageSize);

    //根据id查询
    List<T> selectone(int id);
    //根据id查询
    T selectone2(int id);
}

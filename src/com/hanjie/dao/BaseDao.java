package com.hanjie.dao;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface BaseDao<T> {

    //添加方法
    int add(T t) throws SQLException, IOException, ClassNotFoundException;
    //修改方法
    int update(T t) throws SQLException, IOException, ClassNotFoundException;
    //删除方法
    int delete(int id) throws SQLException, IOException, ClassNotFoundException;
    //查询所有方法
    List<T> selectAll() throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
    //查询所有方法 分页
    List<T> selectAllPaping(int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
    //根据id查询  entity
    List<T> selectone(int id);
    //根据id查询
    T selectone2(int id);
}

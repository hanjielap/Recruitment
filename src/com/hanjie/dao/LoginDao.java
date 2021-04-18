package com.hanjie.dao;

import com.hanjie.entity.Enterprise;
import com.hanjie.entity.Superuser;
import com.hanjie.entity.User;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 登录dao
 */
public interface LoginDao {
    //个人登录
    List<User> userLogin(User user) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
    //企业登录
    List<Enterprise> enterLogin(Enterprise enterprise) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;
    //管理员登录
    List<Superuser> superLogin(Superuser superuser) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException;

    //修改个人密码
    int updateUser(User user) throws SQLException, IOException, ClassNotFoundException;

    //修改企业密码
    int updateEnter(Enterprise enterprise) throws SQLException, IOException, ClassNotFoundException;

    //个人注册
    int addUser(User user) throws SQLException, IOException, ClassNotFoundException;
    //企业注册
    int addEnter(Enterprise enterprise) throws SQLException, IOException, ClassNotFoundException;
    //修改管理员密码
    int updateSuper(Superuser superuser) throws SQLException, IOException, ClassNotFoundException;
}

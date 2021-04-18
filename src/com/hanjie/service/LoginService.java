package com.hanjie.service;

import com.hanjie.entity.Enterprise;
import com.hanjie.entity.Superuser;
import com.hanjie.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * 登录dao
 */
public interface LoginService {
    //个人登录
    List<User> userLogin(User user);
    //企业登录
    List<Enterprise> enterLogin(Enterprise enterprise);
    //管理员登录
    List<Superuser> superLogin(Superuser superuser);

    //修改个人密码
    int updateUser(User user);

    //修改企业密码
    int updateEnter(Enterprise enterprise);

    //个人注册
    int addUser(User user) ;
    //企业注册
    int addEnter(Enterprise enterprise);

    //修改管理员密码
    int updateSuper(Superuser superuser);
}

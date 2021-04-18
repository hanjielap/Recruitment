package com.hanjie.service.impl;

import com.hanjie.dao.LoginDao;
import com.hanjie.dao.impl.LoginDaoimpl;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.Superuser;
import com.hanjie.entity.User;
import com.hanjie.service.LoginService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 登录dao
 */
public class LoginServiceimpl implements LoginService {
    private LoginDao loginDao=new LoginDaoimpl();

    @Override
    public List<User> userLogin(User user) {
        List<User> users=null;
        try {
            users= loginDao.userLogin(user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (users!=null){

            return users;
        }else {
            System.out.println("返回数据为空");
        }
        return users;
    }

    @Override
    public List<Enterprise> enterLogin(Enterprise enterprise) {
        List<Enterprise>enterprises =null;
        try {
            enterprises= loginDao.enterLogin(enterprise);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (enterprises!=null){
            return enterprises;
        }else {
            System.out.println("返回数据为空");
        }
        return enterprises;
    }

    @Override
    public List<Superuser> superLogin(Superuser superuser) {
        List<Superuser> superusers=null;
        try {
            superusers= loginDao.superLogin(superuser);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (superusers!=null){
            return superusers;
        }else {
            System.out.println("返回数据为空");
        }
        return superusers;
    }

    @Override
    public int updateUser(User user) {
        int i=0;
        try {
            i = loginDao.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateEnter(Enterprise enterprise) {
        int i=0;
        try {
            i = loginDao.updateEnter(enterprise);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int addUser(User user) {
        int i=0;
        try {
            i = loginDao.addUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int addEnter(Enterprise enterprise) {
        int i=0;
        try {
            i = loginDao.addEnter(enterprise);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int updateSuper(Superuser superuser) {
        int i=0;
        try {
            i = loginDao.updateSuper(superuser);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return i;
    }
}

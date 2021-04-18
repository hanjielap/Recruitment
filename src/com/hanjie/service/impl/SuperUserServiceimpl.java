package com.hanjie.service.impl;

import com.hanjie.dao.SuperUserDao;
import com.hanjie.dao.impl.SuperUserDaoimpl;
import com.hanjie.entity.User;
import com.hanjie.entity.query.Userquery;
import com.hanjie.service.SuperUserService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员个人用户dao
 */
public class SuperUserServiceimpl implements SuperUserService {
    private SuperUserDao superUserDao=new SuperUserDaoimpl();

    @Override
    public long getTocal(Userquery userquery) {
        long tocal=0;
        try {
            tocal = superUserDao.getTocal(userquery);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tocal;
    }

    @Override
    public List<User> pagingQuery(Userquery userquery, int pageIndex, int pageSize) {
        List<User> users=null;
        try {
            users = superUserDao.pagingQuery(userquery, pageIndex, pageSize);
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
            return  users;
        }else {
            System.out.println("返回数据为空");
        }
        return  users;
    }

    @Override
    public int add(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        int update=0;
        try {
            update = superUserDao.update(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return update;
    }

    @Override
    public int delete(int id) {
        int delete=0;
        try {
            delete= superUserDao.delete(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return delete;
    }

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public List<User> selectAllPaping(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<User> selectone(int id) {
        return null;
    }

    @Override
    public User selectone2(int id) {
        return null;
    }
}

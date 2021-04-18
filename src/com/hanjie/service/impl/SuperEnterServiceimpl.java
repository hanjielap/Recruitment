package com.hanjie.service.impl;


import com.hanjie.dao.SuperEnterDao;
import com.hanjie.dao.impl.SuperEnterDaoimpl;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Enterquery;
import com.hanjie.service.SuperEnterService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 管理员企业dao
 */
public class SuperEnterServiceimpl implements SuperEnterService {
    private SuperEnterDao superEnterDao=new SuperEnterDaoimpl();

    @Override
    public long getTocal(Enterquery enterquery) {
        long tocal=0;
        try {
            tocal = superEnterDao.getTocal(enterquery);
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
    public List<Enterprise> pagingQuery(Enterquery enterquery, int pageIndex, int pageSize) {
        List<Enterprise> enterprises=null;
        try {
            enterprises = superEnterDao.pagingQuery(enterquery, pageIndex, pageSize);
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
            return  enterprises;
        }else {
            System.out.println("返回数据为空");
        }
        return  enterprises;
    }


    @Override
    public int add(Enterprise enterprise) {
        return 0;
    }

    @Override
    public int update(Enterprise enterprise) {
        int update=0;
        try {
            update = superEnterDao.update(enterprise);
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
            delete= superEnterDao.delete(id);
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
    public List<Enterprise> selectAll() {
        return null;
    }

    @Override
    public List<Enterprise> selectAllPaping(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<Enterprise> selectone(int id) {
        return null;
    }

    @Override
    public Enterprise selectone2(int id) {
        return null;
    }
}

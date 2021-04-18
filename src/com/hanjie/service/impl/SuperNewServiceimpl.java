package com.hanjie.service.impl;

import com.hanjie.dao.SuperNewDao;
import com.hanjie.dao.impl.SuperNewDaoimpl;
import com.hanjie.entity.Affiche;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Affichequery;
import com.hanjie.service.SuperNewService;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;


/**
 * 管理员新闻公告dao
 */
public class SuperNewServiceimpl implements SuperNewService {
    private SuperNewDao superNewDao=new SuperNewDaoimpl();

    @Override
    public long getTocal(Affichequery affichequery) {
        long tocal=0;
        try {
            tocal = superNewDao.getTocal(affichequery);
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
    public List<Affiche> pagingQuery(Affichequery affichequery, int pageIndex, int pageSize) {
        List<Affiche> affiches=null;
        try {
            affiches = superNewDao.pagingQuery(affichequery, pageIndex, pageSize);
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
        if (affiches!=null){
            return  affiches;
        }else {
            System.out.println("返回数据为空");
        }
        return  affiches;
    }

    @Override
    public int add(Affiche affiche) {
        int add=0;
        try {
            add= superNewDao.add(affiche);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return add;
    }

    @Override
    public int update(Affiche affiche) {
        int update=0;
        try {
            update = superNewDao.update(affiche);
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
            delete= superNewDao.delete(id);
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
    public List<Affiche> selectAll() {
        return null;
    }

    @Override
    public List<Affiche> selectAllPaping(int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<Affiche> selectone(int id) {
        return null;
    }

    @Override
    public Affiche selectone2(int id) {
        return null;
    }
}

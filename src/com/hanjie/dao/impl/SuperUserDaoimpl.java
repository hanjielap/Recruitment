package com.hanjie.dao.impl;

import com.hanjie.dao.SuperUserDao;
import com.hanjie.entity.User;
import com.hanjie.entity.query.Userquery;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理员个人用户dao
 */
public class SuperUserDaoimpl implements SuperUserDao {
    @Override
    public long getTocal(Userquery userquery) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from user ");
        //获得条件
        String name = userquery.getUsername();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and username=? ");
            }else {
                sb.append(" where username=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<User> pagingQuery(Userquery userquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from user ");
        //获得条件
        String name =  userquery.getUsername();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and username=? ");
            }else {
                sb.append(" where username=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<User> users = DbUtil.executeQuery(User.class, sb.toString(), pars.toArray());
        return users;
    }

    @Override
    public int add(User user) throws SQLException, IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public int update(User user) throws SQLException, IOException, ClassNotFoundException {
        String sql="update user set username=?, userpass=? where userid=?";
        int i = DbUtil.executeUpdate(sql, user.getUsername(), user.getUserpass(), user.getUserid());
        return i;
    }

    @Override
    public int delete(int id) throws SQLException, IOException, ClassNotFoundException {
        String sql="DELETE from  user where userid=?";
        int i = DbUtil.executeUpdate(sql,id);
        return i;
    }

    @Override
    public List<User> selectAll() throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<User> selectAllPaping(int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
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

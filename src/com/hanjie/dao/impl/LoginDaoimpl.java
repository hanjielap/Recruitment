package com.hanjie.dao.impl;

import com.hanjie.dao.LoginDao;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.Superuser;
import com.hanjie.entity.User;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * 登录dao
 */
public class LoginDaoimpl implements LoginDao {


    @Override
    public List<User> userLogin(User user) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        String sql="select * from user where username=? and userpass=? ";
        List<User> users = DbUtil.executeQuery(User.class, sql, user.getUsername(), user.getUserpass());
        return users;
    }

    @Override
    public List<Enterprise> enterLogin(Enterprise enterprise) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        String sql="select * from enterprise where enterpriselogname=? and enterpriselogpass=? ";
        List<Enterprise> enterprises = DbUtil.executeQuery(Enterprise.class, sql, enterprise.getEnterpriselogname(), enterprise.getEnterpriselogpass());
        return enterprises;
    }

    @Override
    public List<Superuser> superLogin(Superuser superuser) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        String sql="select * from superuser where superusername=? and superuserpass=? ";
        List<Superuser> superusers = DbUtil.executeQuery(Superuser.class, sql, superuser.getSuperusername(), superuser.getSuperuserpass());
        return superusers;
    }

    @Override
    public int updateUser(User user) throws SQLException, IOException, ClassNotFoundException {
        String sql="update user set userpass=? where userid=?";
        int i = DbUtil.executeUpdate(sql, user.getUserpass(), user.getUserid());
        return i;
    }

    @Override
    public int updateEnter(Enterprise enterprise) throws SQLException, IOException, ClassNotFoundException {
        String sql="update enterprise set enterpriselogpass=? where enterpriseid=?";
        int i = DbUtil.executeUpdate(sql, enterprise.getEnterpriselogpass(), enterprise.getEnterpriseid());
        return i;
    }

    @Override
    public int addUser(User user) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`user`( `username`, `userpass`) VALUES ( ?, ?)";
        int i = DbUtil.executeUpdate(sql, user.getUsername(), user.getUserpass());
        return i;
    }

    @Override
    public int addEnter(Enterprise enterprise) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`enterprise`( `enterpriselogname`, `enterpriselogpass`, `enterprisename`, `enterprisesite`, `enterpriseinte`, `enterprisephone`) VALUES (?, ?,?, ?, ?, ?)";
        int i = DbUtil.executeUpdate(sql, enterprise.getEnterpriselogname(), enterprise.getEnterpriselogpass(), enterprise.getEnterprisename(), enterprise.getEnterprisesite(),
                enterprise.getEnterpriseinte(), enterprise.getEnterprisephone());
        return i;
    }

    @Override
    public int updateSuper(Superuser superuser) throws SQLException, IOException, ClassNotFoundException {
        String sql="update superuser set superuserpass=? where superuserid=?";
        int i = DbUtil.executeUpdate(sql, superuser.getSuperuserpass(), superuser.getSuperuserid());
        return i;
    }
}

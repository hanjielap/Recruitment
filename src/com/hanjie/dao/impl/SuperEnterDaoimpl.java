package com.hanjie.dao.impl;


import com.hanjie.dao.SuperEnterDao;
import com.hanjie.entity.Enterprise;
import com.hanjie.entity.query.Enterquery;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 管理员企业dao
 */
public class SuperEnterDaoimpl implements SuperEnterDao {
    @Override
    public int add(Enterprise enterprise) throws SQLException, IOException, ClassNotFoundException {
        return 0;
    }

    @Override
    public int update(Enterprise enterprise) throws SQLException, IOException, ClassNotFoundException {
       String sql="UPDATE `recruitment`.`enterprise` SET `enterpriselogname` = ?, `enterpriselogpass` = ?, `enterprisename` = ?, `enterprisesite` = ?, `enterpriseinte` = ?, `enterprisephone` = ? WHERE `enterpriseid` = ?";
        int i = DbUtil.executeUpdate(sql, enterprise.getEnterpriselogname(), enterprise.getEnterpriselogpass(), enterprise.getEnterprisename(), enterprise.getEnterprisesite(), enterprise.getEnterpriseinte(), enterprise.getEnterprisephone(), enterprise.getEnterpriseid());
        return i;
    }

    @Override
    public int delete(int id) throws SQLException, IOException, ClassNotFoundException {
        String sql="DELETE from  enterprise where enterpriseid=?";
        int i = DbUtil.executeUpdate(sql,id);
        return i;
    }

    @Override
    public List<Enterprise> selectAll() throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<Enterprise> selectAllPaping(int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
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

    @Override
    public long getTocal(Enterquery enterquery) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from enterprise ");
        //获得条件
        String name = enterquery.getEnterprisename();
        String phone = enterquery.getEnterprisephone();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and enterprisename=? ");
            }else {
                sb.append(" where enterprisename=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        if (phone!=null &&!"".equals(phone)){
            if(whereFalg){
                sb.append(" and enterprisephone=? ");
            }else {
                sb.append(" where enterprisephone=? ");
                whereFalg=true;
            }
            pars.add(phone);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<Enterprise> pagingQuery(Enterquery enterquery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from enterprise ");
        //获得条件
        String name = enterquery.getEnterprisename();
        String phone = enterquery.getEnterprisephone();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and enterprisename=? ");
            }else {
                sb.append(" where enterprisename=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        if (phone!=null &&!"".equals(phone)){
            if(whereFalg){
                sb.append(" and enterprisephone=? ");
            }else {
                sb.append(" where enterprisephone=? ");
                whereFalg=true;
            }
            pars.add(phone);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<Enterprise> enterprises = DbUtil.executeQuery(Enterprise.class, sb.toString(), pars.toArray());
        return enterprises;
    }
}

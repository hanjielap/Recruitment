package com.hanjie.dao.impl;

import com.hanjie.dao.SuperNewDao;
import com.hanjie.entity.Affiche;
import com.hanjie.entity.query.Affichequery;
import com.hanjie.util.DbUtil;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 * 管理员新闻公告dao
 */
public class SuperNewDaoimpl implements SuperNewDao {
    @Override
    public long getTocal(Affichequery affichequery) throws SQLException, IOException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select count(*) from affiche ");
        //获得条件
        String name = affichequery.getAffichetitle();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and affichetitle=? ");
            }else {
                sb.append(" where affichetitle=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        long total = DbUtil.getTotal(sb.toString(), pars.toArray());
        return total;
    }

    @Override
    public List<Affiche> pagingQuery(Affichequery affichequery, int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        StringBuilder sb = new StringBuilder(" select * from affiche ");
        //获得条件
        String name = affichequery.getAffichetitle();
        //判断是否加where
        boolean whereFalg=false;
        ArrayList<Object> pars = new ArrayList<>();
        if (name!=null &&!"".equals(name)){
            if(whereFalg){
                sb.append(" and affichetitle=? ");
            }else {
                sb.append(" where affichetitle=? ");
                whereFalg=true;
            }
            pars.add(name);
        }
        sb.append(" LIMIT ?,? ");
        pars.add((pageIndex-1)*pageSize);
        pars.add(pageSize);
        System.out.println(sb.toString());
        List<Affiche> affiches = DbUtil.executeQuery(Affiche.class, sb.toString(), pars.toArray());
        return affiches;
    }

    @Override
    public int add(Affiche affiche) throws SQLException, IOException, ClassNotFoundException {
        String sql="INSERT INTO `recruitment`.`affiche`( `affichetitle`, `createtime`) VALUES (?,now());";
        int i = DbUtil.executeUpdate(sql, affiche.getAffichetitle());
        return i;
    }

    @Override
    public int update(Affiche affiche) throws SQLException, IOException, ClassNotFoundException {
        String sql="UPDATE `recruitment`.`affiche` SET `affichetitle` = ?, `createtime` =now() WHERE `afficheid` = ?;";
        int i = DbUtil.executeUpdate(sql, affiche.getAffichetitle(), affiche.getAfficheid());
        return i;
    }

    @Override
    public int delete(int id) throws SQLException, IOException, ClassNotFoundException {
        String sql="DELETE from  affiche where afficheid=?";
        int i = DbUtil.executeUpdate(sql, id);
        return i;
    }

    @Override
    public List<Affiche> selectAll() throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
        return null;
    }

    @Override
    public List<Affiche> selectAllPaping(int pageIndex, int pageSize) throws IllegalAccessException, InvocationTargetException, IOException, InstantiationException, SQLException, NoSuchMethodException, ClassNotFoundException {
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

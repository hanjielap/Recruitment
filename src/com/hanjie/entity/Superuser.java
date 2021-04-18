package com.hanjie.entity;


import java.io.Serializable;

/**
 * 管理员表
 */
public class Superuser implements Serializable {
    private Integer superuserid; //管理员表id
    private String  superusername;  //管理员账号
    private String  superuserpass;  //管理员密码

    public Superuser(Integer superuserid, String superusername, String superuserpass) {
        this.superuserid = superuserid;
        this.superusername = superusername;
        this.superuserpass = superuserpass;
    }

    public Superuser() {
    }

    @Override
    public String toString() {
        return "Superuser{" +
                "superuserid=" + superuserid +
                ", superusername='" + superusername + '\'' +
                ", superuserpass='" + superuserpass + '\'' +
                '}';
    }

    public Integer getSuperuserid() {
        return superuserid;
    }

    public void setSuperuserid(Integer superuserid) {
        this.superuserid = superuserid;
    }

    public String getSuperusername() {
        return superusername;
    }

    public void setSuperusername(String superusername) {
        this.superusername = superusername;
    }

    public String getSuperuserpass() {
        return superuserpass;
    }

    public void setSuperuserpass(String superuserpass) {
        this.superuserpass = superuserpass;
    }
}

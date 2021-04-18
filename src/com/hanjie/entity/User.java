package com.hanjie.entity;

import java.io.Serializable;

/**
 * 个人用户表
 */
public class User implements Serializable {
    private Integer userid; //用户表id
    private String  username;  //个人用户账号
    private String  userpass;  //个人用户密码

    public User(Integer userid, String username, String userpass) {
        this.userid = userid;
        this.username = username;
        this.userpass = userpass;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", userpass='" + userpass + '\'' +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }
}

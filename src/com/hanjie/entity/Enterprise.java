package com.hanjie.entity;

import java.io.Serializable;

/**
 * 企业信息表
 */

public class Enterprise implements Serializable {
    private Integer enterpriseid;  //企业信息id
    private String  enterpriselogname;  //企业用户账号
    private String  enterpriselogpass;  //企业用户密码
    private String  enterprisename;  //企业名称
    private String  enterprisesite;  //企业地址
    private String  enterpriseinte;  //企业介绍
    private String  enterprisephone; //企业联系方式

    public Enterprise(Integer enterpriseid, String enterpriselogname, String enterpriselogpass, String enterprisename, String enterprisesite, String enterpriseinte, String enterprisephone) {
        this.enterpriseid = enterpriseid;
        this.enterpriselogname = enterpriselogname;
        this.enterpriselogpass = enterpriselogpass;
        this.enterprisename = enterprisename;
        this.enterprisesite = enterprisesite;
        this.enterpriseinte = enterpriseinte;
        this.enterprisephone = enterprisephone;
    }

    public Enterprise() {
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseid=" + enterpriseid +
                ", enterpriselogname='" + enterpriselogname + '\'' +
                ", enterpriselogpass='" + enterpriselogpass + '\'' +
                ", enterprisename='" + enterprisename + '\'' +
                ", enterprisesite='" + enterprisesite + '\'' +
                ", enterpriseinte='" + enterpriseinte + '\'' +
                ", enterprisephone='" + enterprisephone + '\'' +
                '}';
    }

    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getEnterpriselogname() {
        return enterpriselogname;
    }

    public void setEnterpriselogname(String enterpriselogname) {
        this.enterpriselogname = enterpriselogname;
    }

    public String getEnterpriselogpass() {
        return enterpriselogpass;
    }

    public void setEnterpriselogpass(String enterpriselogpass) {
        this.enterpriselogpass = enterpriselogpass;
    }

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getEnterprisesite() {
        return enterprisesite;
    }

    public void setEnterprisesite(String enterprisesite) {
        this.enterprisesite = enterprisesite;
    }

    public String getEnterpriseinte() {
        return enterpriseinte;
    }

    public void setEnterpriseinte(String enterpriseinte) {
        this.enterpriseinte = enterpriseinte;
    }

    public String getEnterprisephone() {
        return enterprisephone;
    }

    public void setEnterprisephone(String enterprisephone) {
        this.enterprisephone = enterprisephone;
    }
}

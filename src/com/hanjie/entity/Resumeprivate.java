package com.hanjie.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 简历通过表
 */
public class Resumeprivate implements Serializable {
    private Integer  resumeprivateid;  //简历存储id
    private Integer  enterpriseid ;  //企业id
    private Integer  resumeid;  //个人简历id
    private Integer  resumeprivatestate;  //简历存储通过状态
    private Timestamp createtime; //简历通过时间

    public Resumeprivate(Integer resumeprivateid, Integer enterpriseid, Integer resumeid, Integer resumeprivatestate, Timestamp createtime) {
        this.resumeprivateid = resumeprivateid;
        this.enterpriseid = enterpriseid;
        this.resumeid = resumeid;
        this.resumeprivatestate = resumeprivatestate;
        this.createtime = createtime;
    }

    public Resumeprivate() {
    }

    @Override
    public String toString() {
        return "Resumeprivate{" +
                "resumeprivateid=" + resumeprivateid +
                ", enterpriseid=" + enterpriseid +
                ", resumeid=" + resumeid +
                ", resumeprivatestate=" + resumeprivatestate +
                ", createtime=" + createtime +
                '}';
    }

    public Integer getResumeprivateid() {
        return resumeprivateid;
    }

    public void setResumeprivateid(Integer resumeprivateid) {
        this.resumeprivateid = resumeprivateid;
    }

    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getResumeprivatestate() {
        return resumeprivatestate;
    }

    public void setResumeprivatestate(Integer resumeprivatestate) {
        this.resumeprivatestate = resumeprivatestate;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}

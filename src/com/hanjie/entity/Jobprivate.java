package com.hanjie.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 职位收藏表
 */
public class Jobprivate implements Serializable {
    private  Integer  jobprivateid; //职位存储id
    private  Integer  userid; //个人用户id
    private  Integer  jobid; //职位id
    private  Integer  resumeprivatestate; //职位存储状态
    private Timestamp createtime;  //存储时间

    public Jobprivate(Integer jobprivateid, Integer userid, Integer jobid, Integer resumeprivatestate, Timestamp createtime) {
        this.jobprivateid = jobprivateid;
        this.userid = userid;
        this.jobid = jobid;
        this.resumeprivatestate = resumeprivatestate;
        this.createtime = createtime;
    }

    public Jobprivate() {
    }

    @Override
    public String toString() {
        return "Jobprivate{" +
                "jobprivateid=" + jobprivateid +
                ", userid=" + userid +
                ", jobid=" + jobid +
                ", resumeprivatestate=" + resumeprivatestate +
                ", createtime=" + createtime +
                '}';
    }

    public Integer getJobprivateid() {
        return jobprivateid;
    }

    public void setJobprivateid(Integer jobprivateid) {
        this.jobprivateid = jobprivateid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
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

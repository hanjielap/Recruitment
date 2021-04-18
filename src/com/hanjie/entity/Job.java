package com.hanjie.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 招聘职位表
 */

public class Job implements Serializable {
    private  Integer jobid;  //职位表id
    private  Integer enterpriseid;  //企业id
    private  String  jobtitle;  //职位标题
    private  String  jobname;  //职位名称
    private  String  jobinfo;  //职位介绍
    private  Integer jobissue;  //职位发布状态
    private  Integer jobstate;  //职位招聘状态
    private Timestamp createtime; //职位发布时间

    public Job(Integer jobid, Integer enterpriseid, String jobtitle, String jobname, String jobinfo, Integer jobissue, Integer jobstate, Timestamp createtime) {
        this.jobid = jobid;
        this.enterpriseid = enterpriseid;
        this.jobtitle = jobtitle;
        this.jobname = jobname;
        this.jobinfo = jobinfo;
        this.jobissue = jobissue;
        this.jobstate = jobstate;
        this.createtime = createtime;
    }

    public Job() {
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobid=" + jobid +
                ", enterpriseid=" + enterpriseid +
                ", jobtitle='" + jobtitle + '\'' +
                ", jobname='" + jobname + '\'' +
                ", jobinfo='" + jobinfo + '\'' +
                ", jobissue=" + jobissue +
                ", jobstate=" + jobstate +
                ", createtime=" + createtime +
                '}';
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getJobinfo() {
        return jobinfo;
    }

    public void setJobinfo(String jobinfo) {
        this.jobinfo = jobinfo;
    }

    public Integer getJobissue() {
        return jobissue;
    }

    public void setJobissue(Integer jobissue) {
        this.jobissue = jobissue;
    }

    public Integer getJobstate() {
        return jobstate;
    }

    public void setJobstate(Integer jobstate) {
        this.jobstate = jobstate;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}

package com.hanjie.entity;

import java.sql.Timestamp;

/**
 * 简历收藏显示
 */
public class JobPr {
    private  Integer jobid;  //职位表id
    private  String  jobtitle;  //职位标题
    private  String  jobname;  //职位名称
    private  String  jobinfo;  //职位介绍
    private  Integer jobissue;  //职位发布状态
    private  Integer jobstate;  //职位招聘状态
    private Timestamp createtime; //职位发布时间
    private  Integer enterpriseid;  //企业id
    private String  enterpriselogname;  //企业用户账号
    private String  enterpriselogpass;  //企业用户密码
    private String  enterprisename;  //企业名称
    private String  enterprisesite;  //企业地址
    private String  enterpriseinte;  //企业介绍
    private String  enterprisephone; //企业联系方式
    private  Integer  jobprivateid; //职位存储id
    private  Integer  userid; //个人用户id
    private  Integer  resumeprivatestate; //职位存储状态

    public JobPr(Integer jobid, String jobtitle, String jobname, String jobinfo, Integer jobissue, Integer jobstate, Timestamp createtime, Integer enterpriseid, String enterpriselogname, String enterpriselogpass, String enterprisename, String enterprisesite, String enterpriseinte, String enterprisephone, Integer jobprivateid, Integer userid, Integer resumeprivatestate) {
        this.jobid = jobid;
        this.jobtitle = jobtitle;
        this.jobname = jobname;
        this.jobinfo = jobinfo;
        this.jobissue = jobissue;
        this.jobstate = jobstate;
        this.createtime = createtime;
        this.enterpriseid = enterpriseid;
        this.enterpriselogname = enterpriselogname;
        this.enterpriselogpass = enterpriselogpass;
        this.enterprisename = enterprisename;
        this.enterprisesite = enterprisesite;
        this.enterpriseinte = enterpriseinte;
        this.enterprisephone = enterprisephone;
        this.jobprivateid = jobprivateid;
        this.userid = userid;
        this.resumeprivatestate = resumeprivatestate;
    }

    public JobPr() {
    }

    @Override
    public String toString() {
        return "JobPr{" +
                "jobid=" + jobid +
                ", jobtitle='" + jobtitle + '\'' +
                ", jobname='" + jobname + '\'' +
                ", jobinfo='" + jobinfo + '\'' +
                ", jobissue=" + jobissue +
                ", jobstate=" + jobstate +
                ", createtime=" + createtime +
                ", enterpriseid=" + enterpriseid +
                ", enterpriselogname='" + enterpriselogname + '\'' +
                ", enterpriselogpass='" + enterpriselogpass + '\'' +
                ", enterprisename='" + enterprisename + '\'' +
                ", enterprisesite='" + enterprisesite + '\'' +
                ", enterpriseinte='" + enterpriseinte + '\'' +
                ", enterprisephone='" + enterprisephone + '\'' +
                ", jobprivateid=" + jobprivateid +
                ", userid=" + userid +
                ", resumeprivatestate=" + resumeprivatestate +
                '}';
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
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

    public Integer getResumeprivatestate() {
        return resumeprivatestate;
    }

    public void setResumeprivatestate(Integer resumeprivatestate) {
        this.resumeprivatestate = resumeprivatestate;
    }
}

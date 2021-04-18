package com.hanjie.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 求职信息表
 */
public class Jobrelease implements Serializable {
    private  Integer  jobreleaseid;  //求职发布表id
    private  String  jobreleasetitle;   //求职标题
    private  String  jobreleasename;   //求职名称
    private  String  jobreleaseintrd;   //求职介绍
    private  Integer jobissue ;  //求职发布状态
    private Timestamp createtime;  //职位发布时间

    public Jobrelease(Integer jobreleaseid, String jobreleasetitle, String jobreleasename, String jobreleaseintrd, Integer jobissue, Timestamp createtime) {
        this.jobreleaseid = jobreleaseid;
        this.jobreleasetitle = jobreleasetitle;
        this.jobreleasename = jobreleasename;
        this.jobreleaseintrd = jobreleaseintrd;
        this.jobissue = jobissue;
        this.createtime = createtime;
    }

    public Jobrelease() {
    }

    @Override
    public String toString() {
        return "Jobrelease{" +
                "jobreleaseid=" + jobreleaseid +
                ", jobreleasetitle='" + jobreleasetitle + '\'' +
                ", jobreleasename='" + jobreleasename + '\'' +
                ", jobreleaseintrd='" + jobreleaseintrd + '\'' +
                ", jobissue=" + jobissue +
                ", createtime=" + createtime +
                '}';
    }

    public Integer getJobreleaseid() {
        return jobreleaseid;
    }

    public void setJobreleaseid(Integer jobreleaseid) {
        this.jobreleaseid = jobreleaseid;
    }

    public String getJobreleasetitle() {
        return jobreleasetitle;
    }

    public void setJobreleasetitle(String jobreleasetitle) {
        this.jobreleasetitle = jobreleasetitle;
    }

    public String getJobreleasename() {
        return jobreleasename;
    }

    public void setJobreleasename(String jobreleasename) {
        this.jobreleasename = jobreleasename;
    }

    public String getJobreleaseintrd() {
        return jobreleaseintrd;
    }

    public void setJobreleaseintrd(String jobreleaseintrd) {
        this.jobreleaseintrd = jobreleaseintrd;
    }

    public Integer getJobissue() {
        return jobissue;
    }

    public void setJobissue(Integer jobissue) {
        this.jobissue = jobissue;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}

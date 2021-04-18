package com.hanjie.entity;

import java.io.Serializable;

/**
 * 简历投递表
 */
public class Resumego implements Serializable {
    private Integer  resumegoid;  //简历投递id
    private Integer  resumeid;  //个人简历id
    private Integer  jobid;  //职位id

    public Resumego(Integer resumegoid, Integer resumeid, Integer jobid) {
        this.resumegoid = resumegoid;
        this.resumeid = resumeid;
        this.jobid = jobid;
    }

    public Resumego() {
    }

    @Override
    public String toString() {
        return "Resumego{" +
                "resumegoid=" + resumegoid +
                ", resumeid=" + resumeid +
                ", jobid=" + jobid +
                '}';
    }

    public Integer getResumegoid() {
        return resumegoid;
    }

    public void setResumegoid(Integer resumegoid) {
        this.resumegoid = resumegoid;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }
}

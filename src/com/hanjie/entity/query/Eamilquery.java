package com.hanjie.entity.query;

public class Eamilquery {
    private String jobname;
    private String resumename;
    private String resumeeducation;
    private Integer enterpriseid;

    public Integer getEnterpriseid() {
        return enterpriseid;
    }

    public void setEnterpriseid(Integer enterpriseid) {
        this.enterpriseid = enterpriseid;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename;
    }

    public String getResumeeducation() {
        return resumeeducation;
    }

    public void setResumeeducation(String resumeeducation) {
        this.resumeeducation = resumeeducation;
    }
}

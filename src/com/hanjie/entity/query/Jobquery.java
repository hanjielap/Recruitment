package com.hanjie.entity.query;

import java.io.Serializable;

public class Jobquery implements Serializable {
    private String jobname;
    private String enterprisename;

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }
}

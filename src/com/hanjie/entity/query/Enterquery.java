package com.hanjie.entity.query;

import java.io.Serializable;

public class Enterquery implements Serializable {
    private String enterprisename;
    private String enterprisephone;

    public String getEnterprisename() {
        return enterprisename;
    }

    public void setEnterprisename(String enterprisename) {
        this.enterprisename = enterprisename;
    }

    public String getEnterprisephone() {
        return enterprisephone;
    }

    public void setEnterprisephone(String enterprisephone) {
        this.enterprisephone = enterprisephone;
    }
}

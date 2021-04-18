package com.hanjie.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class EnterResumes implements Serializable {
    private Integer  resumeprivateid;  //简历存储id
    private Integer  enterpriseid ;  //企业id
    private Integer  resumeid;  //个人简历id
    private Integer  resumeprivatestate;  //简历存储通过状态
    private Timestamp createtime; //简历通过时间
    private Integer  userid;  //个人用户id
    private String   resumename;  //个人简历姓名
    private String   resumecard;  //个人简历身份证号
    private String   resumesex;  //个人简历性别
    private Integer  resumeage;  //个人简历年龄
    private String   resumeplace;  //个人简历户籍所在地
    private String   resumeeducation;  //个人简历学历
    private String   resumecollege;  //个人简历毕业院校
    private String   resumespecialty;  //个人简历所学专业
    private String   resumephone;  //个人简历电话
    private String   resumeemail;  //个人简历邮箱
    private String   resumeassessment;  //个人简历自我评价
    private String   resumeskill;  //个人简历专业技能
    private String   resumeproject;  //个人简历项目经验
    private String  enterpriselogname;  //企业用户账号
    private String  enterpriselogpass;  //企业用户密码
    private String  enterprisename;  //企业名称
    private String  enterprisesite;  //企业地址
    private String  enterpriseinte;  //企业介绍
    private String  enterprisephone; //企业联系方式

    public EnterResumes(Integer resumeprivateid, Integer enterpriseid, Integer resumeid, Integer resumeprivatestate, Timestamp createtime, Integer userid, String resumename, String resumecard, String resumesex, Integer resumeage, String resumeplace, String resumeeducation, String resumecollege, String resumespecialty, String resumephone, String resumeemail, String resumeassessment, String resumeskill, String resumeproject, String enterpriselogname, String enterpriselogpass, String enterprisename, String enterprisesite, String enterpriseinte, String enterprisephone) {
        this.resumeprivateid = resumeprivateid;
        this.enterpriseid = enterpriseid;
        this.resumeid = resumeid;
        this.resumeprivatestate = resumeprivatestate;
        this.createtime = createtime;
        this.userid = userid;
        this.resumename = resumename;
        this.resumecard = resumecard;
        this.resumesex = resumesex;
        this.resumeage = resumeage;
        this.resumeplace = resumeplace;
        this.resumeeducation = resumeeducation;
        this.resumecollege = resumecollege;
        this.resumespecialty = resumespecialty;
        this.resumephone = resumephone;
        this.resumeemail = resumeemail;
        this.resumeassessment = resumeassessment;
        this.resumeskill = resumeskill;
        this.resumeproject = resumeproject;
        this.enterpriselogname = enterpriselogname;
        this.enterpriselogpass = enterpriselogpass;
        this.enterprisename = enterprisename;
        this.enterprisesite = enterprisesite;
        this.enterpriseinte = enterpriseinte;
        this.enterprisephone = enterprisephone;
    }

    public EnterResumes() {
    }

    @Override
    public String toString() {
        return "EnterResumes{" +
                "resumeprivateid=" + resumeprivateid +
                ", enterpriseid=" + enterpriseid +
                ", resumeid=" + resumeid +
                ", resumeprivatestate=" + resumeprivatestate +
                ", createtime=" + createtime +
                ", userid=" + userid +
                ", resumename='" + resumename + '\'' +
                ", resumecard='" + resumecard + '\'' +
                ", resumesex='" + resumesex + '\'' +
                ", resumeage=" + resumeage +
                ", resumeplace='" + resumeplace + '\'' +
                ", resumeeducation='" + resumeeducation + '\'' +
                ", resumecollege='" + resumecollege + '\'' +
                ", resumespecialty='" + resumespecialty + '\'' +
                ", resumephone='" + resumephone + '\'' +
                ", resumeemail='" + resumeemail + '\'' +
                ", resumeassessment='" + resumeassessment + '\'' +
                ", resumeskill='" + resumeskill + '\'' +
                ", resumeproject='" + resumeproject + '\'' +
                ", enterpriselogname='" + enterpriselogname + '\'' +
                ", enterpriselogpass='" + enterpriselogpass + '\'' +
                ", enterprisename='" + enterprisename + '\'' +
                ", enterprisesite='" + enterprisesite + '\'' +
                ", enterpriseinte='" + enterpriseinte + '\'' +
                ", enterprisephone='" + enterprisephone + '\'' +
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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getResumename() {
        return resumename;
    }

    public void setResumename(String resumename) {
        this.resumename = resumename;
    }

    public String getResumecard() {
        return resumecard;
    }

    public void setResumecard(String resumecard) {
        this.resumecard = resumecard;
    }

    public String getResumesex() {
        return resumesex;
    }

    public void setResumesex(String resumesex) {
        this.resumesex = resumesex;
    }

    public Integer getResumeage() {
        return resumeage;
    }

    public void setResumeage(Integer resumeage) {
        this.resumeage = resumeage;
    }

    public String getResumeplace() {
        return resumeplace;
    }

    public void setResumeplace(String resumeplace) {
        this.resumeplace = resumeplace;
    }

    public String getResumeeducation() {
        return resumeeducation;
    }

    public void setResumeeducation(String resumeeducation) {
        this.resumeeducation = resumeeducation;
    }

    public String getResumecollege() {
        return resumecollege;
    }

    public void setResumecollege(String resumecollege) {
        this.resumecollege = resumecollege;
    }

    public String getResumespecialty() {
        return resumespecialty;
    }

    public void setResumespecialty(String resumespecialty) {
        this.resumespecialty = resumespecialty;
    }

    public String getResumephone() {
        return resumephone;
    }

    public void setResumephone(String resumephone) {
        this.resumephone = resumephone;
    }

    public String getResumeemail() {
        return resumeemail;
    }

    public void setResumeemail(String resumeemail) {
        this.resumeemail = resumeemail;
    }

    public String getResumeassessment() {
        return resumeassessment;
    }

    public void setResumeassessment(String resumeassessment) {
        this.resumeassessment = resumeassessment;
    }

    public String getResumeskill() {
        return resumeskill;
    }

    public void setResumeskill(String resumeskill) {
        this.resumeskill = resumeskill;
    }

    public String getResumeproject() {
        return resumeproject;
    }

    public void setResumeproject(String resumeproject) {
        this.resumeproject = resumeproject;
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

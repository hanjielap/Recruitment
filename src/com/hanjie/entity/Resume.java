package com.hanjie.entity;

import java.io.Serializable;

/**
 * 简历表
 */
public class Resume implements Serializable {
    private Integer  resumeid;  //个人简历id
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

    public Resume(Integer resumeid, Integer userid, String resumename, String resumecard, String resumesex, Integer resumeage, String resumeplace, String resumeeducation, String resumecollege, String resumespecialty, String resumephone, String resumeemail, String resumeassessment, String resumeskill, String resumeproject) {
        this.resumeid = resumeid;
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
    }

    public Resume() {
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resumeid=" + resumeid +
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
                '}';
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
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
}

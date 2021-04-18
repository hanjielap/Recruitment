package com.hanjie.entity;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 公告新闻表
 */
public class Affiche implements Serializable {
    private Integer afficheid;  //公告新闻id
    private String affichetitle; //公告新闻标题
    private Timestamp createtime; //公告新闻创建时间

    public Affiche(Integer afficheid, String affichetitle, Timestamp createtime) {
        this.afficheid = afficheid;
        this.affichetitle = affichetitle;
        this.createtime = createtime;
    }

    public Affiche() {
    }

    @Override
    public String toString() {
        return "Affiche{" +
                "afficheid=" + afficheid +
                ", affichetitle='" + affichetitle + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public Integer getAfficheid() {
        return afficheid;
    }

    public void setAfficheid(Integer afficheid) {
        this.afficheid = afficheid;
    }

    public String getAffichetitle() {
        return affichetitle;
    }

    public void setAffichetitle(String affichetitle) {
        this.affichetitle = affichetitle;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}

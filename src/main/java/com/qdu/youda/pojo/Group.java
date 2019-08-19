package com.qdu.youda.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Group {

    private int gid;
    private String name;
    private String picture;
    private String sign;
    private int score_week;
    private int score_month;
    private int score_total;
    private int size;
    private String member_list;
    private int isdeleted;
    private Date createon;
    private String remark;

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getGid() {
        return gid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setScore_week(int score_week) {
        this.score_week = score_week;
    }

    public int getScore_week() {
        return score_week;
    }

    public void setScore_month(int score_month) {
        this.score_month = score_month;
    }

    public int getScore_month() {
        return score_month;
    }

    public void setScore_total(int score_total) {
        this.score_total = score_total;
    }

    public int getScore_total() {
        return score_total;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setMember_list(String member_list) {
        this.member_list = member_list;
    }

    public String getMember_list() {
        return member_list;
    }

    public void setIsdeleted(int isdeleted) {
        this.isdeleted = isdeleted;
    }

    public int getIsdeleted() {
        return isdeleted;
    }

    public void setCreateon(Date createon) {
        this.createon = createon;
    }

    public Date getCreateon() {
        return createon;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }
}

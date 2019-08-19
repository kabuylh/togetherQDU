package com.qdu.youda.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Checkin {

    private int cid;
    private int belong;
    private int star;
    private String location;
    private String content;
    private String picture_list;
    private String comment_list;
    private int isdeleted;
    private Date createon;
    private String remark;

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setBelong(int belong) {
        this.belong = belong;
    }

    public int getBelong() {
        return belong;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getStar() {
        return star;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setPicture_list(String picture_list) {
        this.picture_list = picture_list;
    }

    public String getPicture_list() {
        return picture_list;
    }

    public void setComment_list(String comment_list) {
        this.comment_list = comment_list;
    }

    public String getComment_list() {
        return comment_list;
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

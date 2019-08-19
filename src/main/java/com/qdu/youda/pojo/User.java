package com.qdu.youda.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class User {

    private int uid;
    private String name;
    private String picture;
    private String sign;
    private int sex;
    private String region;
    private int phone;
    private String wechat;
    private int qq;
    private String group_list;
    private int isdeleted;
    private Date createon;
    private String remark;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getUid() {
        return uid;
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

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSex() {
        return sex;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getWechat() {
        return wechat;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public int getQq() {
        return qq;
    }

    public void setGroup_list(String group_list) {
        this.group_list = group_list;
    }

    public String getGroup_list() {
        return group_list;
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

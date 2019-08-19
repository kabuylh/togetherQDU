package com.qdu.youda.controller;

import com.qdu.youda.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController extends CommonController {

    @RequestMapping("/manage/insertUser")
    public String insert(String name, String picture, String sign, int sex, String region, int phone, String wechat, int qq, String remark) {
        if (! verifyIsEmpty(name)) {
            return "-----插入失败！-----\n昵称不能为空";
        }
        User user = new User();
        user.setName(name);
        user.setPicture(picture);
        user.setSign(sign);
        user.setSex(sex);
        user.setRegion(region);
        user.setPhone(phone);
        user.setWechat(wechat);
        user.setQq(qq);
        user.setGroup_list("");
        user.setIsdeleted(0);
        user.setCreateon(new Date());
        user.setRemark(remark);
        if (userMapper.insert(user)) {
            return "插入成功";
        }
        return "-----插入失败！-----\n";
    }

    @RequestMapping("/manage/deleteUser")
    public String delete(int uid) {
        if (! verifyIsEmpty(String.valueOf(uid))) {
            return "-----删除失败！-----\nuid不能为空";
        }
        if (userMapper.delete(uid)) {
            return "删除成功";
        }
        return "-----删除失败！-----\n";
    }
}

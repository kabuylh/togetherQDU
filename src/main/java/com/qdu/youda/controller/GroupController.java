package com.qdu.youda.controller;

import com.qdu.youda.pojo.Group;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GroupController extends CommonController {

    @RequestMapping("/manage/insertGroup")
    public String insert(String name, String picture, String sign, String remark) {
        if (! verifyIsEmpty(name)) {
            return "-----插入失败！-----\n群名称不能为空";
        }
        Group group = new Group();
        group.setName(name);
        group.setPicture(picture);
        group.setSign(sign);
        group.setScore_week(0);
        group.setScore_month(0);
        group.setScore_total(0);
        group.setSize(0);
        group.setMember_list("");
        group.setIsdeleted(0);
        group.setCreateon(new Date());
        System.out.println(new Date());
        group.setRemark(remark);
        if (groupMapper.insert(group)) {
            return "插入成功";
        }
        return "-----插入失败！-----\n";
    }

    @RequestMapping("/manage/deleteGroup")
    public String delete(int gid) {
        if (! verifyIsEmpty(String.valueOf(gid))) {
            return "-----删除失败！-----\ngid不能为空";
        }
        if (groupMapper.delete(gid)) {
            return "删除成功";
        }
        return "-----删除失败！-----\n";
    }
}

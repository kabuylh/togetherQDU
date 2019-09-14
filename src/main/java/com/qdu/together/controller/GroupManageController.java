package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GroupManageController extends CommonController {

    @RequestMapping("/manage/group")
    public ModelAndView userManage() {
        return new ModelAndView("groupManage");
    }

    @RequestMapping("/manage/group/insert")
    public String insert() {
        return "保存成功";
    }

    @RequestMapping("/manage/group/delete")
    public String delete() {
        return "保存成功";
    }

    @RequestMapping("/manage/group/update")
    public String update() {
        return "保存成功";
    }

    @RequestMapping("/manage/group/query")
    public String query() {
        return "保存成功";
    }
}

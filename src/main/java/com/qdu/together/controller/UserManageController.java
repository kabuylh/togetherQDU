package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UserManageController extends CommonController {

    @RequestMapping("/manage/user")
    public ModelAndView userManage() {
        return new ModelAndView("userManage");
    }

    @RequestMapping("/manage/user/insert")
    public String insert() {
        return "保存成功";
    }

    @RequestMapping("/manage/user/delete")
    public String delete() {
        return "保存成功";
    }

    @RequestMapping("/manage/user/update")
    public String update() {
        return "保存成功";
    }

    @RequestMapping("/manage/user/query")
    public String query() {
        return "保存成功";
    }
}

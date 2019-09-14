package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CheckinManageController extends CommonController {

    @RequestMapping("/manage/checkin")
    public ModelAndView userManage() {
        return new ModelAndView("checkinManage");
    }

    @RequestMapping("/manage/checkin/insert")
    public String insert() {
        return "保存成功";
    }

    @RequestMapping("/manage/checkin/delete")
    public String delete() {
        return "保存成功";
    }

    @RequestMapping("/manage/checkin/update")
    public String update() {
        return "保存成功";
    }

    @RequestMapping("/manage/checkin/query")
    public String query() {
        return "保存成功";
    }
}

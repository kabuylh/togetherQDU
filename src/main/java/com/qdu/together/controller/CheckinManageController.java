package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CheckinManageController extends CommonController {

    @RequestMapping("/manage/checkin")
    public ModelAndView userManage() {
        return new ModelAndView("checkinManage");
    }

    @RequestMapping("/manage/checkin/insert")
    public String insert(String content, String location) {
        return "保存成功";
    }

    @RequestMapping("/manage/checkin/delete")
    public String delete(String cid) {
        return "保存成功";
    }

    @RequestMapping("/manage/checkin/update")
    public String update(String content, String location, String star) {
        return "保存成功";
    }

    @RequestMapping("/manage/checkin/query")
    public Map query(String cid) {
        Map<String, String> map = new HashMap<>();
        map.put("content", "content");
        map.put("location", "location");
        map.put("star", "star");
        map.put("time", new SimpleDateFormat("yyyy-MM-dd hh:mm").format(new Date()));
        return map;
    }
}

package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GroupManageController extends CommonController {

    @RequestMapping("/manage/group")
    public ModelAndView userManage() {
        return new ModelAndView("groupManage");
    }

    @RequestMapping("/manage/group/insert")
    public String insert(String name, String sign) {
        return "保存成功";
    }

    @RequestMapping("/manage/group/delete")
    public String delete(String gid) {
        return "保存成功";
    }

    @RequestMapping("/manage/group/update")
    public String update(String name, String sign, String score) {
        return "保存成功";
    }

    @RequestMapping("/manage/group/query")
    public Map query(String gid) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "name");
        map.put("sign", "sign");
        map.put("score", "score");
        return map;
    }
}

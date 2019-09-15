package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserManageController extends CommonController {

    @RequestMapping("/manage/user")
    public ModelAndView userManage() {
        return new ModelAndView("userManage");
    }

    @RequestMapping("/manage/user/insert")
    public String insert(String name, String sign, String sex, String region, String phone, String wechat, String qq) {
        return "保存成功";
    }

    @RequestMapping("/manage/user/delete")
    public String delete(String uid) {
        return "保存成功";
    }

    @RequestMapping("/manage/user/update")
    public String update(String name, String sign, String sex, String region, String phone, String wechat, String qq) {
        return "保存成功";
    }

    @RequestMapping("/manage/user/query")
    public Map query(String uid) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "name");
        map.put("sign", "sign");
        map.put("sex", "0");
        map.put("region", "region");
        map.put("phone", "phone");
        map.put("wechat", "wechat");
        map.put("qq", "qq");
        return map;
    }
}

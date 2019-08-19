package com.qdu.youda.controller;

import com.qdu.youda.Service.CheckinService;
import com.qdu.youda.Service.GroupService;
import com.qdu.youda.Service.UserService;
import com.qdu.youda.dao.CheckinMapper;
import com.qdu.youda.dao.GroupMapper;
import com.qdu.youda.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonController {

    @Autowired
    UserMapper userMapper;
    @Autowired
    GroupMapper groupMapper;
    @Autowired
    CheckinMapper checkinMapper;
    @Autowired
    UserService userService;
    @Autowired
    GroupService groupService;
    @Autowired
    CheckinService checkinService;

    boolean verifyIsEmpty(String... param) {
        for (String i : param) {
            if ("".equals(i)) {
                return false;
            }
        }
        return true;
    }
}

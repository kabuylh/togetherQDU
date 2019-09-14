package com.qdu.together.controller;

import com.qdu.together.Service.*;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonController {

    @Autowired
    UserService userService;
    @Autowired
    GroupService groupService;
    @Autowired
    CheckinService checkinService;
}

package com.qdu.youda.controller;

import com.qdu.youda.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController extends CommonController {

    @RequestMapping("/test")
    public String test() {
        System.out.println(userService.InsertUserToGroup(2, 5440));
        return "test";
    }
}

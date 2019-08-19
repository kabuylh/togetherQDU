package com.qdu.youda.controller;

import com.qdu.youda.pojo.Group;
import com.qdu.youda.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@RestController
public class ManageController extends CommonController {

    @RequestMapping("/manage")
    public ModelAndView index() {
        return new ModelAndView("manage");
    }
}

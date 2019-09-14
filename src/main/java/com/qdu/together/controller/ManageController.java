package com.qdu.together.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ManageController {

    @RequestMapping("/manage")
    public ModelAndView manage() {
        return new ModelAndView("manage");
    }
}

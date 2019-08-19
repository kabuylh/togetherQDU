package com.qdu.youda.controller;

import com.qdu.youda.pojo.Checkin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CheckinController extends CommonController {

    @RequestMapping("/manage/insertCheckin")
    public String insert(String location, String content, String picture_list) {
        Checkin checkin = new Checkin();
        checkin.setStar(0);
        checkin.setLocation(location);
        checkin.setContent(content);
        checkin.setPicture_list(picture_list);
        checkin.setComment_list("");
        checkin.setIsdeleted(0);
        checkin.setCreateon(new Date());
        checkin.setRemark("");
        if (checkinMapper.insert(checkin)) {
            return "插入成功";
        }
        return "-----插入失败！-----\n";
    }

    @RequestMapping("/manage/deleteCheckin")
    public String delete(int cid) {
        if (! verifyIsEmpty(String.valueOf(cid))) {
            return "-----删除失败！-----\ncid不能为空";
        }
        if (checkinMapper.delete(cid)) {
            return "删除成功";
        }
        return "-----删除失败！-----\n";
    }
}

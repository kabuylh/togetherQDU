package com.qdu.together.controller;

import com.qdu.together.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonController {

    @Autowired
    public CheckinMapper checkinMapper;
    @Autowired
    public CommentMapper commentMapper;
    @Autowired
    public GroupCheckinMappingMapper groupCheckinMappingMapper;
    @Autowired
    public GroupMapper groupMapper;
    @Autowired
    public UserGroupMappingMapper userGroupMappingMapper;
    @Autowired
    public UserMapper userMapper;
}

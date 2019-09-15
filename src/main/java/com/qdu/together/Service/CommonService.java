package com.qdu.together.Service;

import com.qdu.together.dao.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class CommonService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    GroupMapper groupMapper;
    @Autowired
    CheckinMapper checkinMapper;
    @Autowired
    CommentMapper commentMapper;
    @Autowired
    UserGroupMappingMapper userGroupMappingMapper;
    @Autowired
    GroupCheckinMappingMapper groupCheckinMappingMapper;

    static final Logger logger = LogManager.getLogger();
}

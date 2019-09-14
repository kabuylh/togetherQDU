package com.qdu.together.Service;

import java.util.*;
import com.qdu.together.dao.*;
import com.qdu.together.pojo.Group;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    private GroupMapper groupMapper;
    @Autowired
    private UserGroupMappingMapper userGroupMappingMapper;
    @Autowired
    private GroupCheckinMappingMapper groupCheckinMappingMapper;

    final Logger logger = LogManager.getLogger();

    public boolean insertGroup(Group group) {
        try {
            groupMapper.insert(group);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean deleteGroup(Integer gid) {
        try {
            groupMapper.delete(gid);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean updateGroup(Group group) {
        try {
            groupMapper.update(group);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public Group getGroupByGid(Integer gid) {
        try {
            return groupMapper.select(gid);
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new Group();
        }
    }

    public List<Group> getAllGroup() {
        try {
            return groupMapper.selectAll();
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new ArrayList<>();
        }
    }
}

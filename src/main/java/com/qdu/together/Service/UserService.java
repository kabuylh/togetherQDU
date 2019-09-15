package com.qdu.together.Service;

import java.util.*;
import com.qdu.together.dao.*;
import com.qdu.together.pojo.User;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends CommonService {

    public boolean insertUser(User user) {
        try {
            userMapper.insert(user);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean deleteUser(Integer uid) {
        try {
            userMapper.delete(uid);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean updateUser(User user) {
        try {
            userMapper.update(user);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public User getUserByUid(Integer uid) {
        try {
            return userMapper.select(uid);
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new User();
        }
    }

    public List<User> getAllUser() {
        try {
            return userMapper.selectAll();
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new ArrayList<>();
        }
    }
}

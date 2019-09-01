package com.qdu.youda.Service;

import java.util.*;
import com.qdu.youda.dao.*;
import com.qdu.youda.pojo.Checkin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckinService {

    @Autowired
    private CheckinMapper checkinMapper;
    @Autowired
    private GroupCheckinMappingMapper groupCheckinMappingMapper;

    final Logger logger = LogManager.getLogger();

    public boolean insertCheckin(Checkin checkin) {
        try {
            checkinMapper.insert(checkin);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean deleteCheckin(Integer cid) {
        try {
            checkinMapper.delete(cid);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean updateCheckin(Checkin checkin) {
        try {
            checkinMapper.update(checkin);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public Checkin getCheckinByCid(Integer cid) {
        try {
            return checkinMapper.select(cid);
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new Checkin();
        }
    }

    public List<Checkin> getAllCheckin() {
        try {
            return checkinMapper.selectAll();
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new ArrayList<>();
        }
    }
}

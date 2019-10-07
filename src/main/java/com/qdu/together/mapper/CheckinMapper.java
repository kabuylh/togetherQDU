package com.qdu.together.mapper;

import com.qdu.together.model.Checkin;

public interface CheckinMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Checkin record);

    int insertSelective(Checkin record);

    Checkin selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Checkin record);

    int updateByPrimaryKey(Checkin record);
}
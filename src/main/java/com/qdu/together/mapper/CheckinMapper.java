package com.qdu.together.mapper;

import com.qdu.together.model.Checkin;
import com.qdu.together.model.CheckinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckinMapper {
    int countByExample(CheckinExample example);

    int deleteByExample(CheckinExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Checkin record);

    int insertSelective(Checkin record);

    List<Checkin> selectByExample(CheckinExample example);

    Checkin selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Checkin record, @Param("example") CheckinExample example);

    int updateByExample(@Param("record") Checkin record, @Param("example") CheckinExample example);

    int updateByPrimaryKeySelective(Checkin record);

    int updateByPrimaryKey(Checkin record);
}
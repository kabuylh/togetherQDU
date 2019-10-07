package com.qdu.together.mapper;

import com.qdu.together.model.GroupCheckinMapping;
import com.qdu.together.model.GroupCheckinMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupCheckinMappingMapper {
    int countByExample(GroupCheckinMappingExample example);

    int deleteByExample(GroupCheckinMappingExample example);

    int insert(GroupCheckinMapping record);

    int insertSelective(GroupCheckinMapping record);

    List<GroupCheckinMapping> selectByExample(GroupCheckinMappingExample example);

    int updateByExampleSelective(@Param("record") GroupCheckinMapping record, @Param("example") GroupCheckinMappingExample example);

    int updateByExample(@Param("record") GroupCheckinMapping record, @Param("example") GroupCheckinMappingExample example);
}
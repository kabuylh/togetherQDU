package com.qdu.together.mapper;

import com.qdu.together.model.UserGroupMapping;
import com.qdu.together.model.UserGroupMappingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupMappingMapper {
    int countByExample(UserGroupMappingExample example);

    int deleteByExample(UserGroupMappingExample example);

    int insert(UserGroupMapping record);

    int insertSelective(UserGroupMapping record);

    List<UserGroupMapping> selectByExample(UserGroupMappingExample example);

    int updateByExampleSelective(@Param("record") UserGroupMapping record, @Param("example") UserGroupMappingExample example);

    int updateByExample(@Param("record") UserGroupMapping record, @Param("example") UserGroupMappingExample example);
}
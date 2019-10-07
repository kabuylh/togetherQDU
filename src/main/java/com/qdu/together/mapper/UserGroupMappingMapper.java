package com.qdu.together.mapper;

import com.qdu.together.model.UserGroupMapping;

public interface UserGroupMappingMapper {
    int insert(UserGroupMapping record);

    int insertSelective(UserGroupMapping record);
}
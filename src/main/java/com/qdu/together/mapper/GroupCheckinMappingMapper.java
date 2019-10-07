package com.qdu.together.mapper;

import com.qdu.together.model.GroupCheckinMapping;

public interface GroupCheckinMappingMapper {
    int insert(GroupCheckinMapping record);

    int insertSelective(GroupCheckinMapping record);
}
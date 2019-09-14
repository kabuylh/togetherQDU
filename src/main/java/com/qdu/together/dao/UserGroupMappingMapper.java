package com.qdu.together.dao;

import java.util.List;
import com.qdu.together.pojo.UserGroupMapping;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserGroupMappingMapper {

    @Insert("insert into user_group_mapping values(#{uid}, #{gid})")
    void insert(UserGroupMapping userGroupMapping);

    @Delete("delete from user_group_mapping where uid=#{uid} and gid=#{gid}")
    void delete(Integer uid, Integer gid);

    @Select("select * from user_group_mapping where uid=#{uid} and gid=#{gid}")
    UserGroupMapping select(Integer uid, Integer gid);

    @Select("select * from user_group_mapping")
    List<UserGroupMapping> selectAll();

    @Select("select * from user_group_mapping where uid=#{uid}")
    List<UserGroupMapping> selectByUid(Integer uid);

    @Select("select * from user_group_mapping where gid=#{gid}")
    List<UserGroupMapping> selectByGid(Integer gid);
}

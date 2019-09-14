package com.qdu.together.dao;

import java.util.List;
import com.qdu.together.pojo.GroupCheckinMapping;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GroupCheckinMappingMapper {

    @Insert("insert into group_checkin_mapping values(#{gid}, #{cid})")
    void insert(GroupCheckinMapping groupCheckinMapping);

    @Delete("delete from group_checkin_mapping where gid=#{gid} and cid=#{cid}")
    void delete(Integer gid, Integer cid);

    @Select("select * from group_checkin_mapping where gid=#{gid} and cid=#{cid}")
    GroupCheckinMapping select(Integer gid, Integer cid);

    @Select("select * from group_checkin_mapping")
    List<GroupCheckinMapping> selectAll();

    @Select("select * from group_checkin_mapping where gid=#{gid}")
    List<GroupCheckinMapping> selectByGid(Integer gid);

    @Select("select * from group_checkin_mapping where cid=#{cid}")
    List<GroupCheckinMapping> selectByCid(Integer cid);
}

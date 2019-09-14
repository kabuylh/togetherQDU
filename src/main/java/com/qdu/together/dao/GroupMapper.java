package com.qdu.together.dao;

import java.util.List;
import com.qdu.together.pojo.Group;
import org.apache.ibatis.annotations.*;

@Mapper
public interface GroupMapper {

    @Insert("insert into group_ values(null, #{name}, #{sign}, #{score})")
    void insert(Group group);

    @Delete("delete from group_ where gid=#{gid}")
    void delete(Integer gid);

    @Update("update group_ set name=#{name}, sign=#{sign}, score=#{score} where gid=#{gid}")
    void update(Group group);

    @Select("select * from group_ where gid=#{gid}")
    Group select(Integer gid);

    @Select("select * from group_")
    List<Group> selectAll();
}

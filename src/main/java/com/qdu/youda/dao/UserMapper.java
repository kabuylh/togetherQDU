package com.qdu.youda.dao;

import java.util.List;
import com.qdu.youda.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("insert into user values(null, #{name}, #{sign}, #{sex}, #{region}, #{phone}, #{wechat}, #{qq})")
    void insert(User user);

    @Delete("delete from user where uid=#{uid}")
    void delete(Integer uid);

    @Update("update user set name=#{name}, sign=#{sign}, sex=#{sex}, region=#{region}, phone=#{phone}, wechat=#{wechat}, qq=#{qq} where uid=#{uid}")
    void update(User user);

    @Select("select * from user where uid=#{uid}")
    User select(Integer uid);

    @Select("select * from user")
    List<User> selectAll();
}

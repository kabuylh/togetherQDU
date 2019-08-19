package com.qdu.youda.dao;

import com.qdu.youda.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Insert("insert into user values(null, #{name}, #{picture}, #{sign}, #{sex}, #{region}, #{phone}, #{wechat}, #{qq}, #{group_list}, #{isdeleted}, #{createon}, #{remark})")
    boolean insert(User user);

    @Delete("delete from user where uid=#{uid}")
    boolean delete(int uid);

    @Update("update user set name=#{name}, picture=#{picture}, sign=#{sign}, sex=#{sex}, region=#{region}, phone=#{phone}, wechat=#{wechat}, qq=#{qq}, group_list=#{group_list}, isdeleted=#{isdeleted}, createon=#{createon}, remark=#{remark} where uid=#{uid}")
    boolean update(User user);

    @Select("select * from user")
    List<User> selectAll();

    @Select("select * from user where uid=#{uid}")
    User selectByUid(int uid);

    @Select("select * from user where name=#{name}")
    List<User> selectByName(String name);

    @Select("select * from user where sex=#{sex}")
    List<User> selectBySex(int sex);

    @Select("select * from user where region=#{region}")
    List<User> selectByRegion(String region);

    @Select("select * from user where phone=#{phone}")
    List<User> selectByPhone(int phone);

    @Select("select * from user where wechat=#{wechat}")
    List<User> selectByWechat(String wechat);

    @Select("select * from user where qq=#{qq}")
    List<User> selectByQq(String qq);

    @Select("select * from user where isdeleted=#{isdeleted}")
    List<User> selectByIsdeleted(int isdeleted);

    @Select("select * from user where createon>=#{beginDate} and createon<=#{endDate}")
    List<User> selectByRangeOfCreateon(String beginDate, String endDate);
}

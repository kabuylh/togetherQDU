package com.qdu.youda.dao;

import com.qdu.youda.pojo.Group;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GroupMapper {

    @Insert("insert into group_ values(null, #{name}, #{picture}, #{sign}, #{score_week}, #{score_month}, #{score_total}, #{size}, #{member_list}, #{isdeleted}, #{createon}, #{remark})")
    boolean insert(Group group);

    @Delete("delete from group_ where gid=#{gid}")
    boolean delete(int gid);

    @Update("update group_ set name=#{name}, picture=#{picture}, sign=#{sign}, score_week=#{score_week}, score_month=#{score_month}, score_total=#{score_total}, size=#{size}, member_list=#{member_list}, isdeleted=#{isdeleted}, createon=#{createon}, remark=#{remark} where gid=#{gid}")
    boolean update(Group group);

    @Select("select * from group_")
    List<Group> selectAll();

    @Select("select * from group_ where gid=#{gid}")
    Group selectByGid(int gid);

    @Select("select * from group_ where name=#{name}")
    List<Group> selectByName(String name);

    @Select("select * from group_ order by score_week DESC")
    List<Group> selectAllOrderByScore_weekDESC();

    @Select("select * from group_ order by score_month DESC")
    List<Group> selectAllOrderByScore_monthDESC();

    @Select("select * from group_ order by score_total DESC")
    List<Group> selectAllOrderByScore_totalDESC();

    @Select("select * from group_ where size>=#{min} and size<=#{max} order by size DESC")
    List<Group> selectByRangeOfSizeOrderBySizeDESC(int min, int max);

    @Select("select * from group_ where isdeleted=#{isdeleted}")
    List<Group> selectByIsdeleted(int isdeleted);

    @Select("select * from group_ where createon>=#{beginDate} and createon<=#{endDate}")
    List<Group> selectByRangeOfCreateon(String beginDate, String endDate);
}

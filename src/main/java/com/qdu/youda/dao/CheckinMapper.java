package com.qdu.youda.dao;

import com.qdu.youda.pojo.Checkin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CheckinMapper {

    @Insert("insert into checkin values(null, #{belong}, #{star}, #{location}, #{content}, #{picture_list}, #{comment_list}, #{isdeleted}, #{createon}, #{remark})")
    boolean insert(Checkin checkin);

    @Delete("delete from checkin where cid=#{cid}")
    boolean delete(int cid);

    @Update("update checkin set belong=#{belong}, star=#{star}, location=#{location}, content=#{content}, picture_list=#{picture_list}, comment_list=#{comment_list}, isdeleted=#{isdeleted}, createon=#{createon}, remark=#{remark} where cid=#{cid}")
    boolean update(Checkin checkin);

    @Select("select * from checkin")
    List<Checkin> selectAll();

    @Select("select * from checkin where cid=#{cid}")
    Checkin selectByCid(int cid);

    @Select("select * from checkin where belong=#{belong} order by createon DESC")
    List<Checkin> selectByBelongOrderByCreateonDESC(String belong);

    @Select("select * from checkin where location=#{location}")
    List<Checkin> selectByLocation(String location);

    @Select("select * from checkin where isdeleted=#{isdeleted}")
    List<Checkin> selectByIsdeleted(int isdeleted);

    @Select("select * from checkin where createon>=#{beginDate} and createon<=#{endDate}")
    List<Checkin> selectByRangeOfCreateon(String beginDate, String endDate);
}

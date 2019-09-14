package com.qdu.together.dao;

import java.util.List;
import com.qdu.together.pojo.Checkin;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CheckinMapper {

    @Insert("insert into checkin values(null, #{content}, #{location}, #{star}, #{time})")
    void insert(Checkin checkin);

    @Delete("delete from checkin where cid=#{cid}")
    void delete(Integer cid);

    @Update("update checkin set content=#{content}, location=#{location}, star=#{star}, time=#{time} where cid=#{cid}")
    void update(Checkin checkin);

    @Select("select * from checkin where cid=#{cid}")
    Checkin select(Integer cid);

    @Select("select * from checkin")
    List<Checkin> selectAll();
}

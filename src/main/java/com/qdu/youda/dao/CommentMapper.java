package com.qdu.youda.dao;

import java.util.List;
import com.qdu.youda.pojo.Comment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CommentMapper {

    @Insert("insert into comment values(null, #{comment}, #{cid}, #{uid}, #{time})")
    void insert(Comment comment);

    @Delete("delete from comment where comment_id=#{comment_id}")
    void delete(Integer comment_id);

    @Update("update comment set comment=#{comment}, cid=#{cid}, uid=#{uid}, time=#{time} where comment_id=#{comment_id}")
    void update(Comment comment);

    @Select("select * from comment where comment_id=#{comment_id}")
    Comment select(Integer comment_id);

    @Select("select * from comment")
    List<Comment> selectAll();
}

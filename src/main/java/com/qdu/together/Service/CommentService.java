package com.qdu.together.Service;

import java.util.*;
import com.qdu.together.dao.CommentMapper;
import com.qdu.together.pojo.Comment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService extends CommonService {

    public boolean insertComment(Comment comment) {
        try {
            commentMapper.insert(comment);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean deleteComment(Integer comment_id) {
        try {
            commentMapper.delete(comment_id);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public boolean updateComment(Comment comment) {
        try {
            commentMapper.update(comment);
            return true;
        } catch (Exception e) {
            logger.warn("Exception", e);
            return false;
        }
    }

    public Comment getCommentByCommentId(Integer comment_id) {
        try {
            return commentMapper.select(comment_id);
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new Comment();
        }
    }

    public List<Comment> getAllComment() {
        try {
            return commentMapper.selectAll();
        } catch (Exception e) {
            logger.warn("Exception", e);
            return new ArrayList<>();
        }
    }
}

package com.qdu.youda.Service;

import com.qdu.youda.dao.CheckinMapper;
import com.qdu.youda.dao.GroupMapper;
import com.qdu.youda.dao.UserMapper;
import com.qdu.youda.pojo.Group;
import com.qdu.youda.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public final class UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    GroupMapper groupMapper;

    public boolean InsertUserToGroup(int uid, int gid) {
        User user = userMapper.selectByUid(uid);
        List<String> list = new ArrayList<>(Arrays.asList(user.getGroup_list().split(";")));
        list.add(String.valueOf(gid));
        user.setGroup_list(String.join(";", (String[])list.toArray(new String[0])));
        // userMapper.update(user);
        Group group = groupMapper.selectByGid(gid);
        List<String> list2 = new ArrayList<>(Arrays.asList(group.getMember_list().split(";")));
        list2.add(String.valueOf(uid));
        int count = 0;
        for (String i : list2) {
            System.out.println(count++ + " : " + i);
        }
        group.setMember_list(String.join(";", (String[])list2.toArray(new String[0])));
        // groupMapper.update(group);
        return true;
    }
}

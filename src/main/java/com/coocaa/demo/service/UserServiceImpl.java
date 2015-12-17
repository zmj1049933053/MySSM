package com.coocaa.demo.service;

import com.coocaa.demo.mapper.UserMapper;
import com.coocaa.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhumengjia on 2015/12/15.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findUser() throws Exception{
        //传入null表示无条件查找
         List<User> users = userMapper.selectByExample(null);
        return users;
    }
}

package com.coocaa.demo.service;
import com.coocaa.demo.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhumengjia on 2015/12/15.
 */
public interface UserService {
    List<User> findUser()throws Exception;

}

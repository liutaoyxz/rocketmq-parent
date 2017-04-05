package com.liutaoyxz.rocketmq.user.service.impl;

import com.liutaoyxz.rocketmq.common.protocol.Result;
import com.liutaoyxz.rocketmq.common.protocol.user.UserQueryRes;
import com.liutaoyxz.rocketmq.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liutao
 * @description :
 * @create 2017-04-05 15:49
 */
public class UserServiceImpl implements UserService {

//    @Autowired
//    private Mqusermapper

    public Result<UserQueryRes> queryUserById(Integer userId) {
        return null;
    }
}

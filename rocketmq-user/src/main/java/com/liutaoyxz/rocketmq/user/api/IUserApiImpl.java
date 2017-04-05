package com.liutaoyxz.rocketmq.user.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.liutaoyxz.rocketmq.common.protocol.Result;
import com.liutaoyxz.rocketmq.common.protocol.user.IUserApi;
import com.liutaoyxz.rocketmq.common.protocol.user.UserQueryRes;
import com.liutaoyxz.rocketmq.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liutao
 * @description :
 * @create 2017-04-05 15:47
 */
@Service(version = "1.0.0")
public class IUserApiImpl implements IUserApi {


    @Autowired
    private UserService userService;

    public Result<UserQueryRes> queryUserById(Integer id) {
        return userService.queryUserById(id);
    }
}

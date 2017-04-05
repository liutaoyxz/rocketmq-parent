package com.liutaoyxz.rocketmq.user.service;

import com.liutaoyxz.rocketmq.common.protocol.Result;
import com.liutaoyxz.rocketmq.common.protocol.user.UserQueryRes;

/**
 * @author liutao
 * @description :
 * @create 2017-04-05 15:48
 */
public interface UserService {


    Result<UserQueryRes> queryUserById(Integer userId);

}

package com.liutaoyxz.rocketmq.common.protocol.user;

import com.liutaoyxz.rocketmq.common.protocol.Result;

/**
 * @author liutao
 * @description :  暴露的远程api
 * @create 2017-04-05 15:22
 */
public interface IUserApi {


    Result<UserQueryRes> queryUserById(Integer id);


}

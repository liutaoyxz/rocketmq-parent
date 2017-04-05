package com.liutaoyxz.rocketmq.user.service.impl;

import com.liutaoyxz.rocketmq.common.constants.MQEumes;
import com.liutaoyxz.rocketmq.common.protocol.Result;
import com.liutaoyxz.rocketmq.common.protocol.user.UserQueryRes;
import com.liutaoyxz.rocketmq.dao.entity.MqUser;
import com.liutaoyxz.rocketmq.dao.mapper.MqUserMapper;
import com.liutaoyxz.rocketmq.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liutao
 * @description :
 * @create 2017-04-05 15:49
 */
@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private MqUserMapper mqUserMapper;

    public Result<UserQueryRes> queryUserById(Integer userId) {

        Result<UserQueryRes> result = new Result<>();
        if (userId == null ){
            LOGGER.error("userId is null");
            result.setCode(MQEumes.CommonEnum.PARAM_ERROR.getCode());
            result.setDesc(MQEumes.CommonEnum.PARAM_ERROR.getDesc());
        }
        MqUser mqUser = this.mqUserMapper.selectByPrimaryKey(userId);
        if (mqUser == null){
            LOGGER.error("user not exist");
            result.setCode(MQEumes.UserEnum.USER_NOT_EXIST.getCode());
            result.setDesc(MQEumes.UserEnum.USER_NOT_EXIST.getDesc());
        }
        result.success();
        UserQueryRes res = new UserQueryRes();
        BeanUtils.copyProperties(mqUser,res);
        return result.setData(res);
    }
}

package com.liutaoyxz.rocketmq.common.protocol.user;

/**
 * @author liutao
 * @description :  user 查询
 * @create 2017-04-05 15:40
 */
public class UserQueryReq {

    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}

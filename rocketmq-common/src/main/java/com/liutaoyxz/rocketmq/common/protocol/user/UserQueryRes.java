package com.liutaoyxz.rocketmq.common.protocol.user;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liutao
 * @description :  用户查询返回数据
 * @create 2017-04-05 15:44
 */
public class UserQueryRes {

    private Integer userId;

    private String userName;

    private String userMobile;

    private Integer userScore;

    private Date userRegTime;

    private Date createTime;

    private Date updateTime;

    private BigDecimal userMoney;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public Integer getUserScore() {
        return userScore;
    }

    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    public Date getUserRegTime() {
        return userRegTime;
    }

    public void setUserRegTime(Date userRegTime) {
        this.userRegTime = userRegTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    @Override
    public String toString() {
        return "UserQueryRes{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userScore=" + userScore +
                ", userRegTime=" + userRegTime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", userMoney=" + userMoney +
                '}';
    }
}

package com.liutaoyxz.rocketmq.user.service.impl;

import com.liutaoyxz.rocketmq.common.protocol.Result;
import com.liutaoyxz.rocketmq.common.protocol.user.UserQueryRes;
import com.liutaoyxz.rocketmq.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ltlxy on 2017/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:META-INF/spring/spring-user.xml")
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryUserById() throws Exception {
        Result<UserQueryRes> userQueryResResult = this.userService.queryUserById(1);
        System.out.println(userQueryResResult);
    }

}
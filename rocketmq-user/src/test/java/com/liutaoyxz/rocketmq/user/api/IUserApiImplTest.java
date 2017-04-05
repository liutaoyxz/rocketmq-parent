package com.liutaoyxz.rocketmq.user.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liutaoyxz.rocketmq.common.protocol.user.IUserApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by ltlxy on 2017/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xml/spring-user.xml")
public class IUserApiImplTest {

    @Reference(version = "1.0.0")
    private IUserApi iUserApi;

    @Test
    public void queryUserById() throws Exception {
        System.out.println(iUserApi.queryUserById(1));
    }

}
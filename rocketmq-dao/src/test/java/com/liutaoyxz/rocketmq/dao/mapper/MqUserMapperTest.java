package com.liutaoyxz.rocketmq.dao.mapper;

import com.liutaoyxz.rocketmq.dao.entity.MqUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ltlxy on 2017/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xml/spring-mybatis.xml")
public class MqUserMapperTest {

    @Autowired
    private MqUserMapper mqUserMapper;

    @Test
    public void insert() throws Exception {

        MqUser user = new MqUser();
        user.setUserName("liutao");
        user.setUserScore(100);
        int i = this.mqUserMapper.insert(user);
        System.out.println("insert num is:"+i);
        System.out.println("userId is :"+user.getUserId());

    }

}
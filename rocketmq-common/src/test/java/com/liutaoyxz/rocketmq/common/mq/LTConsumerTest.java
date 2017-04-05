package com.liutaoyxz.rocketmq.common.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ltlxy on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xml/spring-consumer.xml")
public class LTConsumerTest {


    @Autowired
    private LTConsumer consumer;

    @Test
    public void test1() throws InterruptedException {

//        Thread.sleep(10000000000L);

    }


}
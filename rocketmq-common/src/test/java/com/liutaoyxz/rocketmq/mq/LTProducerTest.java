package com.liutaoyxz.rocketmq.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ltlxy on 2017/4/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:xml/spring-producer.xml")
public class LTProducerTest {

    @Autowired
    private LTProducer producer;
    @Test
    public void setSendMsgTimeout() throws Exception {
        for (int i = 0; i < 500; i++) {
            this.producer.sendMessage("testTopic","liutao","12233",("hello mq "+i));
        }
    }

}
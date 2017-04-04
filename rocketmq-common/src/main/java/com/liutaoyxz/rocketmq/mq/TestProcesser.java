package com.liutaoyxz.rocketmq.mq;

import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * Created by ltlxy on 2017/4/4.
 */
public class TestProcesser implements MessageProcessor {
    @Override
    public boolean processMsg(MessageExt msg) {
        System.out.println(new String(msg.getBody()));
        return true;
    }
}

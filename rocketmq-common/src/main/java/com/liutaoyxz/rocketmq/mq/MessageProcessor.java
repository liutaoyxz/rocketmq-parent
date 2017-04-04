package com.liutaoyxz.rocketmq.mq;

import com.alibaba.rocketmq.common.message.MessageExt;

/**
 * Created by ltlxy on 2017/4/4.
 */
public interface MessageProcessor {

    /**
     * 处理消息
     * @param msg
     * @return
     */
    boolean processMsg(MessageExt msg);


}

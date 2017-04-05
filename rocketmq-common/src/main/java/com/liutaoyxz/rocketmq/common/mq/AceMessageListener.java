package com.liutaoyxz.rocketmq.common.mq;

import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import com.alibaba.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import com.alibaba.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import com.alibaba.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by ltlxy on 2017/4/4.
 */
public class AceMessageListener implements MessageListenerConcurrently {

    private MessageProcessor processor;

    private static final Logger LOGGER = LoggerFactory.getLogger(AceMessageListener.class);

    public final void setProcessor(MessageProcessor processor) {
        this.processor = processor;
    }

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgs, ConsumeConcurrentlyContext context) {
        for (MessageExt msg : msgs) {
            try {
                if (!this.processor.processMsg(msg)){
                 return ConsumeConcurrentlyStatus.RECONSUME_LATER;
                }
            } catch (Exception e) {
                LOGGER.error("process msg error",e);
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            }
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}

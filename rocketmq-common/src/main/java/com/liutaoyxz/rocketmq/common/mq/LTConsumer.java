package com.liutaoyxz.rocketmq.common.mq;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.common.consumer.ConsumeFromWhere;
import com.liutaoyxz.rocketmq.common.exception.LTMQException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ltlxy on 2017/4/4.
 */
public class LTConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(LTConsumer.class);

    private DefaultMQPushConsumer consumer;

    private String groupName;
    private String topic;
    private String tags = "*";
    private String nameServerAddr;
    /**
     * Minimum consumer thread number
     */
    private int consumeThreadMin = 20;
    /**
     * Max consumer thread number
     */
    private int consumeThreadMax = 64;

    private MessageProcessor processor;

    public final void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public final void setTopic(String topic) {
        this.topic = topic;
    }

    public final void setTags(String tags) {
        this.tags = tags;
    }

    public final void setNameServerAddr(String nameServerAddr) {
        this.nameServerAddr = nameServerAddr;
    }

    public final void setConsumeThreadMin(int consumeThreadMin) {
        this.consumeThreadMin = consumeThreadMin;
    }

    public final void setConsumeThreadMax(int consumeThreadMax) {
        this.consumeThreadMax = consumeThreadMax;
    }

    public final void setProcessor(MessageProcessor processor) {
        this.processor = processor;
    }

    /**
     * 初始化方法
     * @throws LTMQException mq统一异常
     */
    public void init() throws LTMQException {
        if (StringUtils.isBlank(this.nameServerAddr)){
            throw new LTMQException("nameServerAddr is blank");
        }
        if (StringUtils.isBlank(this.groupName)){
            throw new LTMQException("consumerGroup is blank");
        }
        this.consumer = new DefaultMQPushConsumer(this.groupName);
        this.consumer.setNamesrvAddr(this.nameServerAddr);
        this.consumer.setConsumeThreadMax(this.consumeThreadMax);
        this.consumer.setConsumeThreadMin(this.consumeThreadMin);
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_FIRST_OFFSET);
        AceMessageListener listener = new AceMessageListener();
        listener.setProcessor(this.processor);
        this.consumer.registerMessageListener(listener);
        try {
            this.consumer.subscribe(this.topic,this.tags);
            this.consumer.start();
            LOGGER.info("consumer start..... subTopic is {},groupName is {}",this.topic,this.groupName);
        } catch (MQClientException e) {
            LOGGER.error("consumer start error",e);
        }


    }



}

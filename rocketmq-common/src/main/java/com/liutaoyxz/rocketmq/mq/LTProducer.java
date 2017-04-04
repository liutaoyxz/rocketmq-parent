package com.liutaoyxz.rocketmq.mq;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;
import com.liutaoyxz.rocketmq.exception.LTMQException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ltlxy on 2017/4/4.
 */
public class LTProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(LTProducer.class);
    private String nameServerAddr;
    private String groupName;
    private DefaultMQProducer producer;
    private int topicQueueNums = 4;
    private int maxMessageSize = 1024 * 1024 * 4; // 4M
    private int sendMsgTimeout = 10000;

    public final void setNameServerAddr(String nameServerAddr) {
        this.nameServerAddr = nameServerAddr;
    }

    public final void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public final void setTopicQueueNums(int topicQueueNums) {
        this.topicQueueNums = topicQueueNums;
    }

    public final void setMaxMessageSize(int maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
    }

    public final void setSendMsgTimeout(int sendMsgTimeout) {
        this.sendMsgTimeout = sendMsgTimeout;
    }

    public void init() throws LTMQException {
        if (StringUtils.isBlank(this.nameServerAddr)){
            throw new LTMQException("nameServerAddr is blank");
        }
        if (StringUtils.isBlank(this.groupName)){
            throw new LTMQException("groupName is blank");
        }
        this.producer = new DefaultMQProducer(this.groupName);
        producer.setNamesrvAddr(nameServerAddr);
        producer.setDefaultTopicQueueNums(topicQueueNums);
        producer.setSendMsgTimeout(sendMsgTimeout);
        producer.setMaxMessageSize(this.maxMessageSize);
        try {
            this.producer.start();
            LOGGER.info("producer start...... nameServerAddr is {} ,groupName is {}",this.nameServerAddr,this.groupName);
        } catch (MQClientException e) {
            LOGGER.error("producer start error nameServerAddr is {} ,groupName is {}",this.nameServerAddr,this.groupName);
            throw new LTMQException("producer start error",e);
        }
    }

    public SendResult sendMessage(String topic,String tags,String keys,String body) throws LTMQException {
        if (StringUtils.isBlank(topic)){
            throw new LTMQException("topic is blank");
        }
        if (StringUtils.isBlank(body)){
            throw new LTMQException("body is blank");
        }
        Message msg = new Message(topic,tags,keys,body.getBytes());
        SendResult result;
        try {
            result = this.producer.send(msg);
            return result;
        } catch (Exception e) {
            LOGGER.error("send msg error {}",e.getMessage(),e);
            throw new LTMQException("send msg error",e);
        }
    }


}

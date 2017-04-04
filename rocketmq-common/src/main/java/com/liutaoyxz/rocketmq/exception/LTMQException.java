package com.liutaoyxz.rocketmq.exception;

/**
 * Created by ltlxy on 2017/4/4.
 */
public class LTMQException extends Exception {

    public LTMQException() {
        super();
    }

    public LTMQException(String message) {
        super(message);
    }

    public LTMQException(String message, Throwable cause) {
        super(message, cause);
    }

    public LTMQException(Throwable cause) {
        super(cause);
    }

    protected LTMQException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.liutaoyxz.rocketmq.common.protocol;

import com.liutaoyxz.rocketmq.common.constants.MQEumes;

/**
 * @author liutao
 * @description :
 * @create 2017-04-05 15:42
 */
public class Result<T> {

    //状态码
    private String code;
    //状态描述
    private String desc;

    private T data;

    public void success(){
        this.code = MQEumes.CommonEnum.SUCCESS.getCode();
        this.desc = MQEumes.CommonEnum.SUCCESS.getDesc();
    }

    public T getData() {
        return data;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code='" + code + '\'' +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}

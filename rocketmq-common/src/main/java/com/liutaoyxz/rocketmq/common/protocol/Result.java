package com.liutaoyxz.rocketmq.common.protocol;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
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

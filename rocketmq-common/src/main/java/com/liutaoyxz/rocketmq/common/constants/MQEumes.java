package com.liutaoyxz.rocketmq.common.constants;

/**
 * @author liutao
 * @description :  枚举
 * @create 2017-04-05 16:12
 */
public class MQEumes {


    public enum CommonEnum{
        SUCCESS("10000","操作成功"),PARAM_ERROR("10001","参数错误"),SYSTEM_ERROR("10002","系统错误");

        private String code;
        private String desc;

        CommonEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
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
    }


    public enum UserEnum{

        USER_NOT_EXIST("20001","用户不存在");


        private String code;
        private String desc;

        UserEnum(String code, String desc) {
            this.code = code;
            this.desc = desc;
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
    }




}

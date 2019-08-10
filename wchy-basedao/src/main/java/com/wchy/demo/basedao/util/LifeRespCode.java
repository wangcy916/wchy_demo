package com.wchy.demo.basedao.util;

/**
 * 生活组应答码
 */
public interface LifeRespCode {

    /**
     * 对应生活组还款应答码--H
     */
    interface LifeHK {
        String _default = "H00";
    }

    /**
     * 对应基础组应答码--1
     */
    interface Base {

        /**
         * 对应应答码--1
         */
        interface   UserService {
            String getCardList = "111";
            String getUserInfoByUserId = "112";
            String getUserInfoByUserIdC= "113";
        }

        /**
         * 对应应答码--2
         */
        interface MessageService {
            String sendSms = "121";
            String aaa = "122";
        }

    }

    /**
     * 对应账户组应答码--2
     */
    interface Account {
        /**
         * 对应应答码--1
         */
        interface MessageService {
            String sendMessage = "211";
        }

    }

}

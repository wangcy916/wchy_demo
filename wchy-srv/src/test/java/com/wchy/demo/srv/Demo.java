package com.wchy.demo.srv;

import com.wchy.demo.basedao.util.LifeRespCode;

public class Demo {

    public static void main(String[] args) {

        System.out.println(LifeRespCode.Base.UserService.getUserInfoByUserId);
        System.out.println(LifeRespCode.Base.MessageService.sendSms);
        System.out.println(LifeRespCode.Account.MessageService.sendMessage);
        System.out.println(LifeRespCode.LifeHK._default);



        

    }
}

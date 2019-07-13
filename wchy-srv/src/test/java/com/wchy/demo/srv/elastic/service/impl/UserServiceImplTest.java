package com.wchy.demo.srv.elastic.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wchy.demo.basedao.elastic.User;
import com.wchy.demo.srv.elastic.service.UserService;
import com.wchy.demo.srv.support.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

public class UserServiceImplTest  extends BaseTest {

    private Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();

    @Resource
    private UserService userService;

    @Test
    public void getDemo() {
        User user = new User(1L, "1", "11322419890421332X", "猫戴森", "17701869072");

        userService.createDocument(user);

        User user1 = userService.getByIdNo("11322419890421332X");

        System.out.println("=================" + gson.toJson(user1));
    }

}
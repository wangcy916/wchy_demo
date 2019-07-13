package com.wchy.demo.srv.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wchy.demo.basedao.dto.Account;
import com.wchy.demo.srv.service.AccountService;
import com.wchy.demo.srv.support.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class AccountServiceImplTest extends BaseTest {

    private Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();

    @Resource
    private AccountService accountService;

    @Test
    public void getAccount() {
        Account account = accountService.getAccount();

        System.out.println("===========" + gson.toJson(account));

    }
}
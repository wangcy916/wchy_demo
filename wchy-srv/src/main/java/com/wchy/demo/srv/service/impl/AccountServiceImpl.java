package com.wchy.demo.srv.service.impl;

import com.wchy.demo.basedao.dao.AccountDao;
import com.wchy.demo.basedao.dto.Account;
import com.wchy.demo.srv.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(AccountService.SERVICE_ID)
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    public Account getAccount() {
        return accountDao.getAccount();
    }
}

package com.wchy.demo.basedao.dao.impl;

import com.wchy.demo.basedao.dao.AccountDao;
import com.wchy.demo.basedao.dto.Account;
import org.springframework.stereotype.Service;

@Service(AccountDao.SERVICE_ID)
public class AccountDaoImpl implements AccountDao {

    public Account getAccount() {
        return new Account("1", "32140019900315214X", "wchy", "15601753033");
    }

}

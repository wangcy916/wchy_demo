package com.wchy.demo.basedao.dao;

import com.wchy.demo.basedao.dto.Account;

public interface AccountDao {
    String SERVICE_ID = "accountDao";

    Account getAccount();
}

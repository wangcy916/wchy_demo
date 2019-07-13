package com.wchy.demo.srv.service;

import com.wchy.demo.basedao.dto.Account;

public interface AccountService {

    String SERVICE_ID = "accountService";

    Account getAccount();

}

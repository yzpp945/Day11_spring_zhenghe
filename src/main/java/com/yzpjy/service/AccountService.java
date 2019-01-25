package com.yzpjy.service;

import com.yzpjy.domain.Account;


import java.util.List;

public interface AccountService {


    public List<Account> findAll();

    public void saveAccount(Account account);
}

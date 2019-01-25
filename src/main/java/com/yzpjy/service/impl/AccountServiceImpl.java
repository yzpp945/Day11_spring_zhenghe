package com.yzpjy.service.impl;

import com.yzpjy.dao.AccountDao;
import com.yzpjy.domain.Account;
import com.yzpjy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao dao;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有");
        return dao.findAll();
        //return dao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        dao.saveAccount(account);
    }
}

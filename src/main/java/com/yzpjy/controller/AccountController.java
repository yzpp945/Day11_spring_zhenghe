package com.yzpjy.controller;


import com.yzpjy.domain.Account;
import com.yzpjy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 这里开始调用 但是没有读取application 要去xml里弄个监听
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService service;
    @RequestMapping("/findAll")
    public String findAll(Model model){
        List<Account> accounts = service.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }
        model.addAttribute("accounts",accounts);
        return "success";
    }
}

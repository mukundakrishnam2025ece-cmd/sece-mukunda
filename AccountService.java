package com.sece.eceb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sece.eceb.dto.Account;

@Service
public class AccountService {
    ArrayList<Account> accounts = new ArrayList<>();
    public Account createAccount(Account account) {
        accounts.add(account);
        return account;
    }
    public List<Account> getAccount(){
        return accounts;
    }
    public Account createAccount(Account account) {
        accounts.add(account);
        return account;
    }
}

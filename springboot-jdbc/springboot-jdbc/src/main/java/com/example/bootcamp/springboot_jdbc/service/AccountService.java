package com.example.bootcamp.springboot_jdbc.service;

import com.example.bootcamp.springboot_jdbc.model.Account;
import com.example.bootcamp.springboot_jdbc.model.AccountJoin;

import java.util.List;

public interface AccountService {
    List<Account> listAll();

    Account get(Integer id);

    Account save(Account account);

    Account deposit(float amount, Integer id);

    Account withdraw(float amount, Integer id);

    void delete(Integer id);

    List<AccountJoin> findAllWithBalance();
}

package com.example.bootcamp.springboot_jdbc.repository;

import com.example.bootcamp.springboot_jdbc.model.Account;
import com.example.bootcamp.springboot_jdbc.model.AccountJoin;

import java.util.List;

public interface AccountRepository {
    int save(Account account);
    int update(Account account);
    Account findById(Integer id);
    List<Account> findAll();
    boolean existsById(Integer id);
    int deleteById(Integer id);
    int deposit(float amount, Integer id);
    int withdraw(float amount, Integer id);

    List<AccountJoin> findAccountWithBalance();
}
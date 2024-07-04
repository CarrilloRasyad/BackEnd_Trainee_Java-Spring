//package com.example.bootcamp.springboot_jdbc;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import com.example.bootcamp.springboot_jdbc.repository.AccountRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.test.context.ActiveProfiles;
//
//import com.example.bootcamp.springboot_jdbc.model.Account;
//
//@ActiveProfiles("test")
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class AccountRepositoryTest {
//    @Autowired
//    AccountRepository accountRepository;
//
//    @Test
//    public void testCreateReadDelete() {
//        String accountNumber = "1111122222";
//        float balance = 20000;
//        Account account = new Account(accountNumber,balance);
//        Account savedAccount = accountRepository.save(account);
//
//        assertNotNull(savedAccount);
//        assertNotNull(savedAccount.getId());
//        assertThat(savedAccount).usingRecursiveComparison().ignoringFields("id").isEqualTo(account);
//
//        Iterable<Account> accounts = accountRepository.findAll();
//        assertThat(accounts).extracting(Account::getAccountNumber).containsOnlyOnce(accountNumber);
//
//        accountRepository.deleteAll();
//        assertThat(accountRepository.findAll().isEmpty());
//    }
//}
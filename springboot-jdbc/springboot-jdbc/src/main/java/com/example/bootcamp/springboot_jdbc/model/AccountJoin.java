package com.example.bootcamp.springboot_jdbc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountJoin {
//    private String bank_name;
    private Integer id;
    private String accountName;
    private float balance;
}

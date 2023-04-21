package com.reto.nttData.domain.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private Long id;
    private AccountDTO account;
    private Date date;
    private String transactionType;
    private Double amount;
    private Double balance;
}

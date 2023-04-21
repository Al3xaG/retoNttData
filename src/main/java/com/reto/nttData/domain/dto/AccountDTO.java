package com.reto.nttData.domain.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long id;
    private ClientDTO client;
    private String accountNumber;
    private String accountType;
    private Double initialBalance;
    private String status;
    private List<TransactionDTO> transactions;
}

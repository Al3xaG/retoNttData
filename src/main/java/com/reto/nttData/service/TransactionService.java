package com.reto.nttData.service;

import com.reto.nttData.domain.dto.ClientDTO;
import com.reto.nttData.domain.dto.TransactionDTO;

public interface TransactionService {
    TransactionDTO createTransaction(TransactionDTO transactionDTO);
    TransactionDTO getTransaction(String id);
    TransactionDTO updateTransaction(TransactionDTO transactionDTO);
    Boolean deleteTransaction(String id);
}

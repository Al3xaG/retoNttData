package com.reto.nttData.service;

import com.reto.nttData.domain.dto.AccountDTO;
import com.reto.nttData.domain.dto.ClientDTO;

public interface AccountService {
    AccountDTO createAccount(AccountDTO accountDTO);
    AccountDTO getAccount(String id);
    AccountDTO updateAccount(AccountDTO accountDTO);
    Boolean deleteAccount(String id);
}

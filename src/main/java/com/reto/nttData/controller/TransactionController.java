package com.reto.nttData.controller;

import com.reto.nttData.domain.dto.ClientDTO;
import com.reto.nttData.domain.dto.TransactionDTO;
import com.reto.nttData.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<TransactionDTO> createTransaction(@RequestBody TransactionDTO transactionDTO){
        return ResponseEntity.ok(transactionService.createTransaction(transactionDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> getTransaction(@PathVariable String id){
        return ResponseEntity.ok(transactionService.getTransaction(id));
    }

    @PutMapping
    public ResponseEntity<TransactionDTO> updateClient(@RequestBody TransactionDTO transactionDTO){
        return ResponseEntity.ok(transactionService.updateTransaction(transactionDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteClient(@PathVariable String id){
        return ResponseEntity.ok(transactionService.deleteTransaction(id));
    }

}

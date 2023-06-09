package com.aanbari.transactionservice.controller;

import com.aanbari.transactionservice.TransactionServiceApplication;
import com.aanbari.transactionservice.model.Transaction;
import com.aanbari.transactionservice.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TransactionController {

    @Autowired
    TransactionService transactionService;


    @GetMapping("/transaction-service/from/{from}/to/{to}")
    public List<Transaction> getFromTo(@PathVariable int from, @PathVariable int to){

        List<Transaction> transactions = transactionService.getTransactionFromTo(from, to);
        return transactions;
    }

    @GetMapping("/transaction-service/from/{from}")
    public List<Transaction> getUserTransactions(@PathVariable int from){

        List<Transaction> transactions = transactionService.getTransactionFrom(from);
        return transactions;
    }

    @PostMapping("/transaction-service")
    public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction transaction){

        transaction.setTimestamp(System.currentTimeMillis());
        Transaction newTransaction = transactionService.saveTransaction(transaction);

        return new ResponseEntity(newTransaction, HttpStatus.CREATED);
    }
}

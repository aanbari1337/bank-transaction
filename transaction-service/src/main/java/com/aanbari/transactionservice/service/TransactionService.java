package com.aanbari.transactionservice.service;

import com.aanbari.transactionservice.exception.NotFoundException;
import com.aanbari.transactionservice.model.Transaction;
import com.aanbari.transactionservice.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    public List<Transaction> getTransactionFromTo(int from, int to) throws NotFoundException {

        return transactionRepository.findByFromAndTo(from, to);
    };

    public Transaction saveTransaction(Transaction transaction){

        Transaction newTransaction = transactionRepository.save(transaction);

        return newTransaction;
    }

    public List<Transaction> getTransactionFrom(int from) {
        return transactionRepository.findByFrom(from);
    }
}

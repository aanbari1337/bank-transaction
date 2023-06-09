package com.aanbari.transactionservice.repository;

import com.aanbari.transactionservice.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    List<Transaction> findByFromAndTo(int from, int to);
    List<Transaction> findByFrom(int from);

}

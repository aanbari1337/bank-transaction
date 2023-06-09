package com.aanbari.userservice.proxy;

import com.aanbari.userservice.entity.Transaction;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "transaction-service")
public interface TransactionProxy {

    @GetMapping("/transaction-service/from/{from}")
    List<Transaction> getUserTransactions(@PathVariable int from);
}

package com.aanbari.userservice.controller;

import com.aanbari.userservice.entity.Transaction;
import com.aanbari.userservice.model.User;
import com.aanbari.userservice.proxy.TransactionProxy;
import com.aanbari.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    TransactionProxy transactionProxy;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }

    @GetMapping("/user/{id}/transactions")
    public List<Transaction> getUserTransactions(@PathVariable int id){
        List<Transaction> transactionList = transactionProxy.getUserTransactions(id);
        return transactionList;
    }
    @PostMapping("/user")
    public ResponseEntity<User> postUser(@RequestBody User user){

        User newUser = userService.addUser(user);

        return new ResponseEntity<User>(newUser, HttpStatus.CREATED);
    }
}

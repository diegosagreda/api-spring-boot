package com.example.demo.controllers;
import com.example.demo.models.Transaction;
import com.example.demo.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("transactions")
public class TransactionController {
    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;

    @Autowired
    TransactionService transactionService;
    @GetMapping
    public ArrayList<Transaction> getTransactions(){
        return transactionService.getAllTransactions();
    }
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.createTransaction(transaction);
    }
    @GetMapping(path = {"/{id}"})
    public Optional<Transaction> getTransactionById (@PathVariable("id") Long id){
        return transactionService.getTransactionById(id);
    }
    @DeleteMapping(path = {"/{id}"})
    public String deleteTransaction (@PathVariable ("id") Long id){
        boolean ok = transactionService.deleteTransaction(id);
        return  ok ? "Eliminado con exito" : "No se pudo eliminar";
    }
}

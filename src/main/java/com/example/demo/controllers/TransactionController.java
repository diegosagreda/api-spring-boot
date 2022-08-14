package com.example.demo.controllers;
import com.example.demo.models.Transaction;
import com.example.demo.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class TransactionController {
    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;

    @Autowired
    TransactionService transactionService;
    @GetMapping("/transactions")
    public String transactions(){
        return "listaIngresos";
    }
    @GetMapping("/transactions/create")
    public String create(){
        return "formIngreso";
    }

}

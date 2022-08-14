package com.example.demo.controllers;
import com.example.demo.models.Enterprice;
import com.example.demo.services.EnterpriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;
@Controller
public class EnterpriceController {

    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;

    @Autowired
    EnterpriceService enterpriceService;
    @GetMapping("/enterprices")
    public String enterprices(){
        return "listaEmpresas";
    }
    @GetMapping("/enterprices/create")
    public String create(){
        return "formEnterprice";
    }



}

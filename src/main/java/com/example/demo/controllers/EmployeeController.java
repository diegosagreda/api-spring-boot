package com.example.demo.controllers;

import com.example.demo.models.Employee;

import com.example.demo.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class EmployeeController {
    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/employees")
    public String employees(){
        return "listaUsuarios";
    }
    @GetMapping("/employees/create")
    public String craate(){
        return "formEmployee";
    }


}

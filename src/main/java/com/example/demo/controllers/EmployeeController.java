package com.example.demo.controllers;

import com.example.demo.models.Employee;

import com.example.demo.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;
    @Autowired
    EmployeeService employeeService;
    @GetMapping
    public ArrayList<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }
    @GetMapping(path = {"/{id}"})
    public Optional<Employee> getEmployeeById (@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }
    @DeleteMapping(path = {"/{id}"})
    public String deleteEmployee (@PathVariable ("id") Long id){
        boolean ok = employeeService.deleteEmployee(id);
        return  ok ? "Eliminado con exito" : "No se pudo eliminar";
    }
}

package com.example.demo.services;

import com.example.demo.models.Employee;
import com.example.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public ArrayList<Employee> getAllEmployees (){
        return (ArrayList<Employee>) employeeRepository.findAll();
    }
    public Employee createEmployee (Employee employee){
        return employeeRepository.save(employee);
    }
    public Optional<Employee> getEmployeeById (Long id){
        return employeeRepository.findById(id);
    }
    public boolean deleteEmployee (Long id){
        try {
            employeeRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}

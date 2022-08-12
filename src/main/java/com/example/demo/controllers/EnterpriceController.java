package com.example.demo.controllers;
import com.example.demo.models.Enterprice;
import com.example.demo.services.EnterpriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/enterprices")
public class EnterpriceController {

    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;

    @Autowired
    EnterpriceService enterpriceService;
    @GetMapping
    public ArrayList<Enterprice> getEnterprices(){
        return enterpriceService.getAllEnterprices();
    }
    @PostMapping
    public Enterprice createEnterprice(@RequestBody Enterprice enterprice){
        return enterpriceService.createEnterprice(enterprice);
    }
    @GetMapping(path = {"/{id}"})
    public Optional<Enterprice> getEnterpriceById (@PathVariable("id") Long id){
        return enterpriceService.getEnterpriceById(id);
    }
    @DeleteMapping(path = {"/{id}"})
    public String deleteEnterprice (@PathVariable ("id") Long id){
        boolean ok = enterpriceService.deleteEnterprice(id);
        return  ok ? "Eliminado con exito" : "No se pudo eliminar";
    }

}

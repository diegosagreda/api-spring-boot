package com.example.demo.services;

import com.example.demo.models.Enterprice;
import com.example.demo.repositories.EnterpriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EnterpriceService {
    @Autowired
    EnterpriceRepository enterpriceRepository;
    //Creamos metodos
    public ArrayList<Enterprice> getAllEnterprices (){
        return (ArrayList<Enterprice>) enterpriceRepository.findAll();
    }
    public Enterprice createEnterprice (Enterprice enterprice){
        return enterpriceRepository.save(enterprice);
    }
    public Optional<Enterprice> getEnterpriceById (Long id){
        return enterpriceRepository.findById(id);
    }
    public boolean deleteEnterprice (Long id){
        try {
            enterpriceRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}

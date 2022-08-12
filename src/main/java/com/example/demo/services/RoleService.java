package com.example.demo.services;


import com.example.demo.models.Role;

import com.example.demo.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;
    public ArrayList<Role> getAllRoles (){
        return (ArrayList<Role>) roleRepository.findAll();
    }
    public Role createRole (Role role){
        return roleRepository.save(role);
    }
    public Optional<Role> getRoleById (Long id){
        return roleRepository.findById(id);
    }
    public boolean deleteRole (Long id){
        try {
            roleRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}

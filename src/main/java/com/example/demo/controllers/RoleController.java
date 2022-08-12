package com.example.demo.controllers;
import com.example.demo.models.Role;
import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("roles")
public class RoleController {

    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;

    @Autowired
    RoleService roleService;
    @GetMapping
    public ArrayList<Role> getRoles(){
        return roleService.getAllRoles();
    }
    @PostMapping
    public Role createRole(@RequestBody Role role){
        return roleService.createRole(role);
    }
    @GetMapping(path = {"/{id}"})
    public Optional<Role> getRoleById (@PathVariable("id") Long id){
        return roleService.getRoleById(id);
    }
    @DeleteMapping(path = {"/{id}"})
    public String deleteRole (@PathVariable ("id") Long id){
        boolean ok = roleService.deleteRole(id);
        return  ok ? "Eliminado con exito" : "No se pudo eliminar";
    }
}

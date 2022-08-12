package com.example.demo.controllers;
import com.example.demo.models.Profile;
import com.example.demo.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("profiles")
public class ProfileController {
    private WebMvcProperties.MatchingStrategy matchingStrategy = WebMvcProperties.MatchingStrategy.PATH_PATTERN_PARSER;

    @Autowired
    ProfileService profileService;
    @GetMapping
    public ArrayList<Profile> getProfiles(){
        return profileService.getAllProfiles();
    }
    @PostMapping
    public Profile createProfile(@RequestBody Profile profile){
        return profileService.createProfile(profile);
    }
    @GetMapping(path = {"/{id}"})
    public Optional<Profile> getProfileById (@PathVariable("id") Long id){
        return profileService.getProfileById(id);
    }
    @DeleteMapping(path = {"/{id}"})
    public String deleteProfile (@PathVariable ("id") Long id){
        boolean ok = profileService.deleteProfile(id);
        return  ok ? "Eliminado con exito" : "No se pudo eliminar";
    }

}

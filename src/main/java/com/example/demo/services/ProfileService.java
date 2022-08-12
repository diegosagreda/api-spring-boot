package com.example.demo.services;

import com.example.demo.models.Profile;
import com.example.demo.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;
    public ArrayList<Profile> getAllProfiles (){
        return (ArrayList<Profile>) profileRepository.findAll();
    }
    public Profile createProfile (Profile profile){
        return profileRepository.save(profile);
    }
    public Optional<Profile> getProfileById (Long id){
        return profileRepository.findById(id);
    }
    public boolean deleteProfile (Long id){
        try {
            profileRepository.deleteById(id);
            return true;
        }catch (Exception ex){
            return false;
        }

    }
}

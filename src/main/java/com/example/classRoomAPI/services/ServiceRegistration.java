package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Registration;
import com.example.classRoomAPI.repositories.IRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRegistration {

    @Autowired
    IRegistrationRepository repository;

    public Registration saveRegistration (Registration dataRegistration) throws Exception{
        try {
            return this.repository.save(dataRegistration);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Registration> findAllRegistration (Registration registration) throws Exception{

        try {
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }


}

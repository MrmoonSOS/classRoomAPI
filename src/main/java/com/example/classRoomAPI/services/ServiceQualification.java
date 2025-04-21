package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Qualifications;
import com.example.classRoomAPI.repositories.IQualificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceQualification {

    @Autowired
    IQualificationsRepository repository;

    public Qualifications saveQualification (Qualifications dataQualifications) throws Exception {
        try{
            return this.repository.save(dataQualifications);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Qualifications> findAllQualifications (Qualifications qualifications) throws Exception{

        try{
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Assistance;
import com.example.classRoomAPI.repositories.IAssistanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAssistance {

    @Autowired
    IAssistanceRepository repository;

    //save method
    public Assistance saveAsistance (Assistance dataAssistance) throws Exception {
        try{
            return this.repository.save(dataAssistance);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    //searchAll method
    public List<Assistance> findAllAssistence (Assistance assistance) throws Exception{
        try{
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    //searchById method
    //toModify method
    //delete method
}

package com.example.classRoomAPI.services;

import aj.org.objectweb.asm.commons.TryCatchBlockSorter;
import com.example.classRoomAPI.models.Subjects;
import com.example.classRoomAPI.repositories.ISubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceSubjects {

    @Autowired
    ISubjectsRepository repository;

    public Subjects subjectsData(Subjects dataSubjects) throws Exception {

        try{
            return repository.save(dataSubjects);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Subjects> findAllSubjects(Subjects subjects)throws Exception{
        try{
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

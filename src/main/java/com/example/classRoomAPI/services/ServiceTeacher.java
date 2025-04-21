package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Teacher;
import com.example.classRoomAPI.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTeacher {

    @Autowired
    ITeacherRepository repository;

    //save method
    public Teacher saveTeacher(Teacher dataTeacher) throws Exception {
        try{
            return this.repository.save(dataTeacher);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    //searchAll method

    public List <Teacher> findAllTeacher (Teacher dataTeacher) throws Exception{
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

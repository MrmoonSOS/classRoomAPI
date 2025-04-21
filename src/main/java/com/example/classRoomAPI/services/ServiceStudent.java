package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Student;
import com.example.classRoomAPI.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceStudent {
    @Autowired
    IStudentRepository repository;

    public Student saveStudent (Student dataStudent) throws Exception{
        try {
            return this.repository.save(dataStudent);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Student> findAllStudent (Student student) throws Exception{

        try{
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

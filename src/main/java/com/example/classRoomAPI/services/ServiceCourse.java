package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.Course;
import com.example.classRoomAPI.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
public class ServiceCourse {

    @Autowired
    ICourseRepository repository;

    public Course saveCourse (Course dataCourse) throws Exception{
        try {
            return this.repository.save(dataCourse);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<Course> findAllCouerse (Course course) throws Exception{
        try{
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

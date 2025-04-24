package com.example.classRoomAPI.services;

import com.example.classRoomAPI.helpers.ApiMessage;
import com.example.classRoomAPI.models.Teacher;
import com.example.classRoomAPI.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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
    public Teacher findById(Integer id) throws Exception {
        try {
            return this.repository.findById(id)
                    .orElseThrow(() -> new Exception(ApiMessage.ERROR_TEACHER_NOT_FOUND.getMessage()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    //toModify method
    public Teacher teacherModify(Integer id, Teacher newDataTeacher) throws Exception {
        try {
            Optional<Teacher> editTeacher = this.repository.findById(id);

            if (editTeacher.isPresent()) {
                Teacher existingTeacher = editTeacher.get();
                existingTeacher.setSpeciality(newDataTeacher.getSpeciality());
                existingTeacher.setIdTeacher(newDataTeacher.getIdTeacher());
                return this.repository.save(existingTeacher);
            } else {
                throw new RuntimeException(ApiMessage.ERROR_TEACHER_NOT_FOUND.getMessage());
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    //delete method
    public boolean deleteTeacher(Integer id)throws Exception{
        try{
            Optional<Teacher> teacherOptional=this.repository.findById(id);
            if (teacherOptional.isPresent()){
                this.repository.deleteById(id);
                return true;
            }else{
                throw new RuntimeException(ApiMessage.ERROR_TEACHER_NOT_FOUND.getMessage());
            }
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

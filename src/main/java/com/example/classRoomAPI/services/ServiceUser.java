package com.example.classRoomAPI.services;

import com.example.classRoomAPI.models.User;
import com.example.classRoomAPI.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUser {
    @Autowired
    IUserRepository repository;

    public User userData (User dataUser) throws Exception{
        try{
            return this.repository.save(dataUser);
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public List<User> findAllUser (User user) throws Exception{
        try{
            return this.repository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e.getMessage());
        }

    }
}

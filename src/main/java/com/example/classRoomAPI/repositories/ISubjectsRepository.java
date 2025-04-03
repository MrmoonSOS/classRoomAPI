package com.example.classRoomAPI.repositories;

import com.example.classRoomAPI.models.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISubjectsRepository extends JpaRepository<Subjects,Integer> {
}

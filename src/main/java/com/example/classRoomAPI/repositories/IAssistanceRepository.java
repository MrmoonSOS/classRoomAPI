package com.example.classRoomAPI.repositories;

import com.example.classRoomAPI.models.Assistance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAssistanceRepository extends JpaRepository<Assistance,Integer> {
}

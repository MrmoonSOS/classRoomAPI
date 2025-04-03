package com.example.classRoomAPI.repositories;

import com.example.classRoomAPI.models.Qualifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IQualificationsRepository extends JpaRepository<Qualifications,Integer> {
}

package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.Jpa.Repository.JpaRepository;
import com.example.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{
    
}
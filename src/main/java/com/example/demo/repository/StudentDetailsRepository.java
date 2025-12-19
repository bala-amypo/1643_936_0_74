package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentDetailsEntity;

@Repository
public interface StudentDetailsRepository extends JpaRepository<StudentDetailsEntity, Integer>{

}
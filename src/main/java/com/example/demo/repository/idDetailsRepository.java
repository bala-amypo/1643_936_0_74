package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.idDetailsEntity;

@Repository
public interface idDetailsRepository extends JpaRepository<idDetailsEntity, Integer>{

}
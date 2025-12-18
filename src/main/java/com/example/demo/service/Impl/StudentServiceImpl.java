package com.example.demo.service.Impl;

import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    @Override
    public StudentEntity Postdata(StudentEntity entity){
        return student.save(entity);
    }
    @Override
    public List<StudentEntity>getAllData(){
        return student.findAll();
    }
}
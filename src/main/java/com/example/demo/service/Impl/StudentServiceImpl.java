package com.example.demo.service.Impl;

import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Autowired;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    public StudentEntity PostData(StudentEntity entity){
        return student.save(stu);
    }
}
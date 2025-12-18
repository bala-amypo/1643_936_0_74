package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.StudentEntity;

public interface StudentService {
    StudentEntity Postdata(StudentEntity entity);
    List<StudentEntity>getAllData();
    String DeleteData(int id);
    StudentEntity FindId(int id);
}
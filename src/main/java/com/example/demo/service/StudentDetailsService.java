package com.example.demo.service.Impl;

import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class StudetDetailsServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    
    public StudentEntity Postdata(StudentEntity entity){
        return student.save(entity);
    }
    public List<StudentEntity>getAllData(){
        return student.findAll();
    }
    public String DeleteData(int id){
        student.deleteById(id);
        return "Deleted Succesfully";
    }
    public StudentEntity FindId(int id){
        return student.findById(id).orElse(null);
    }
    public StudentEntity PutData(int id, StudentEntity entity){
        if(student.existsById(id)){
            entity.setId(id);
            return student.save(entity);
        }else{
            return student.save(entity);
        }
    }
}
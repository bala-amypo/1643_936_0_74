package com.example.demo.service.Impl;

import com.example.demo.entity.idStudentEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.idDetailsRepository;
import com.example.demo.service.idDetailsService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class idtDetailsServiceImpl{
    @Autowired idDetailsRepository student;
    
    public idDetailsEntity Postdata(idDetailsEntity entity){
        return student.save(entity);
    }
    public List<idDetailsEntity>getAllData(){
        return student.findAll();
    }
    public String DeleteData(int id){
        student.deleteById(id);
        return "Deleted Succesfully";
    }
    public idDetailsEntity FindId(int id){
        return student.findById(id).orElse(null);
    }
    public idDetailsEntity PutData(int id, idDetailsEntity entity){
        if(student.existsById(id)){
            entity.setId(id);
            return student.save(entity);
        }else{
            return student.save(entity);
        }
    }
}
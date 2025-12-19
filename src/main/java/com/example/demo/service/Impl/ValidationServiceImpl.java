package com.example.demo.service.Impl;

import com.example.demo.entity.ValidationEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ValidationServiceImpl implements ValidationService{
    @Autowired ValidationRepository student;
    @Override
    public ValidationEntity Postdata(ValidationEntity entity){
        return student.save(entity);
    }
    @Override
    public List<ValidationEntity>getAllData(){
        return student.findAll();
    }
    @Override
    public String DeleteData(Long id){
        student.deleteById(id);
        return "Deleted Succesfully";
    }
    @Override
    public ValidationEntity FindId(Long id){
        return student.findById(id).orElseThrow();
    }
    @Override 
    public ValidationEntity PutData(Long id, ValidationEntity entity){
        if(student.existsById(id)){
            entity.setId(id);
            return student.save(entity);
        }else{
            return student.save(entity);
        }
    }
}
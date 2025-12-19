package com.example.demo.service.Impl;

import com.example.demo.entity.ValidationEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;
import com.example.demo.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class TimeStampServiceImpl implements TimeStampService{
    @Autowired TimeStampRepository student;
    @Override
    public TimeStampEntity Postdata(TimeStampEntity entity){
        return student.save(entity);
    }
    @Override
    public List<TimeStampEntity>getAllData(){
        return student.findAll();
    }
    @Override 
    public TimeStampEntity PutData(Long id, TimeStampEntity entity){
        if(student.existsById(id)){
            entity.setId(id);
            return student.save(entity);
        }else{
            return student.save(entity);
        }
    }
}
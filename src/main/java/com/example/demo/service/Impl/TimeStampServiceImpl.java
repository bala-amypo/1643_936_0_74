package com.example.demo.service.Impl;

import com.example.demo.entity.TimeStampEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDateTime;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class TimeStampServiceImpl implements TimeStampService{
    @Autowired TimeStampRepository student;
    @Override
    public TimeStampEntity postData(TimeStampEntity entity){
        return student.save(entity);
    }
    @Override
    public List<TimeStampEntity>getAllData(){
        return student.findAll();
    }
    @Override 
    public TimeStampEntity putData(Long id, TimeStampEntity entity){
        if(student.existsById(id)){
            entity.setId(id);
            return student.save(entity);
        }else{
            return student.save(entity);
        }
    }
}
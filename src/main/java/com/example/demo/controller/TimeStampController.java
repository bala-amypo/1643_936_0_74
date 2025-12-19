package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.TimeStampService;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.demo.entity.TimeStampEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import java.util.List;

@RestController
public TimeStampController{
    @Autowired TimeStampService service;
    @PostMapping("/nvpost")
    public TimeStampEntity postvalue(@Valid @RequestBody TimeStampEntity entity){
        return service.Postdata(entity);
    }
    @GetMapping("/nvget")
    public List<ValidationEntity> getAll(){
        return service.getAllData();
    }
    @PutMapping("/nvput/{id}")
    public TimeStampEntity PutData(@PathVariable Long id, @RequestBody TimeStampEntity entity){
        return service.PutData(id, entity);
    }

}
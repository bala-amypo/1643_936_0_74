package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {
    @Autowired StudentService service;
    @PostMapping("/post")
    public StudentEntity postvalue(@RequestBody StudentEntity entity){
        return service.Postdata(entity);
    }
    @GetMapping("/get")
    public List<StudentEntity> getAll(){
        return service.getAllData();
    }
    @DeleteMapping("/del/{id}")
    public String DeleteData(@PathVariable int id){
        return service.DeleteData(id);
    }

}
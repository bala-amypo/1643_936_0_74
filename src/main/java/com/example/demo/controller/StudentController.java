package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Restcontroller
public class StudentController {
    @Autowired StudentService service;
    @PostMapping("/post")
    public StudentEntity postvalue(@RequestBody StudentEntity entity){
        return service.postdata(entity);
    }
}
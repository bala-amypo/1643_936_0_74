package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@Restcontroller
public class StudentController {
    @Autowired StudentService 
}
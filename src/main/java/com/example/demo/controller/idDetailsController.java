package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.idDetailsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.demo.entity.idDetailsEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class idDetailsController {
    @Autowired idDetailsService service;
    @PostMapping("/post")
    public idDetailsEntity postvalue(@RequestBody idDetailsEntity entity){
        return service.Postdata(entity);
    }
    @GetMapping("/get")
    public List<idDetailsEntity> getAll(){
        return service.getAllData();
    }
    @DeleteMapping("/del/{id}")
    public String DeleteData(@PathVariable int id){
        return service.DeleteData(id);
    }
    @GetMapping("/find/{id}")
    public idDetailsEntity FindId(@PathVariable int id){
        return service.FindId(id);
    }
    @PutMapping("/put/{id}")
    public idDetailsEntity PutData(@PathVariable int id, @RequestBody idDetailsEntity entity){
        return service.PutData(id, entity);
    }

}
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.ValidationService;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.demo.entity.ValidationEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ValidationController {
    @Autowired ValidationService service;
    @PostMapping("/nvpost")
    public ValidationEntity postvalue(@RequestBody ValidationEntity entity){
        return service.Postdata(entity);
    }
    @GetMapping("/nvget")
    public List<ValidationEntity> getAll(){
        return service.getAllData();
    }
    @DeleteMapping("/nvdel/{id}")
    public String DeleteData(@PathVariable Long id){
        return service.DeleteData(id);
    }
    @GetMapping("/nvfind/{id}")
    public ValidationEntity FindId(@PathVariable Long id){
        return service.FindId(id);
    }
    @PutMapping("/nvput/{id}")
    public ValidationEntity PutData(@PathVariable Long id, @RequestBody ValidationEntity entity){
        return service.PutData(id, entity);
    }

}
package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ValidationEntity;

public interface ValidationService {
    ValidationEntity Postdata(ValidationEntity entity);
    List<ValidationEntity>getAllData();
    String DeleteData(int id);
    ValidationEntity FindId(int id);
    ValidationEntity PutData(int id, ValidationEntity entity);
}
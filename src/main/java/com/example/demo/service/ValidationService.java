package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ValidationEntity;

public interface ValidationService {
    ValidationEntity Postdata(ValidationEntity entity);
    List<ValidationEntity>getAllData();
    String DeleteData(Long id);
    ValidationEntity FindId(Long id);
    ValidationEntity PutData(Long id, ValidationEntity entity);
}
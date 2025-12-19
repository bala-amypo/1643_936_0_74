package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.ValidationEntity;

public interface TimeStampService {
    ValidationEntity Postdata(ValidationEntity entity);
    List<ValidationEntity>getAllData();
    ValidationEntity PutData(Long id, ValidationEntity entity);
}
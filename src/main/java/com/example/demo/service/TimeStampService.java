package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.TimeStampEntity;

public interface TimeStampService {
    TimeStampEntity postData(TimeStampEntity entity);
    List<TimeStampEntity>getAllData();
    TimeStampEntity putData(Long id, TimeStampEntity entity);
}
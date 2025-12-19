package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.TimeStampEntity;

public interface TimeStampService {
    TimeStampEntity Postdata(TimeStampEntity entity);
    List<TimeStampEntity>getAllData();
    TimeStampEntity PutData(Long id, TimeStampEntity entity);
}
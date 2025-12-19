package com.example.demo.controller;

import com.example.demo.entity.TimeStampEntity;
import com.example.demo.service.TimeStampService;
import jakarta.validation.Valid;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timestamp")
public class TimeStampController {

    private final TimeStampService service;

    public TimeStampController(TimeStampService service) {
        this.service = service;
    }

    @PostMapping("/npost")
    public TimeStampEntity postValue(@Valid @RequestBody TimeStampEntity entity) {
        return service.postData(entity);
    }

    @GetMapping("/nget")
    public List<TimeStampEntity> getAll() {
        return service.getAllData();
    }

    @PutMapping("/nput/{id}")
    public TimeStampEntity putData(@PathVariable Long id,
                                   @RequestBody TimeStampEntity entity) {
        return service.putData(id, entity).;
    }
}

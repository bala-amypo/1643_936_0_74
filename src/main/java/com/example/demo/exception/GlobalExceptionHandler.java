package com.example.demo.exception;

import java.lang.RuntimeException;
import org.springframework.web.bind.annotation.RestController;

@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
    public GlobalExceptionHandler(String message){
        super(message);

    }
}
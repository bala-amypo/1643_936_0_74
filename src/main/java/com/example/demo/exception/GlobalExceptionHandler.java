package com.example.demo.exception;

import java.lang.RuntimeException;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler
    public GlobalExceptionHandler(String message){
        super(message);

    }
}
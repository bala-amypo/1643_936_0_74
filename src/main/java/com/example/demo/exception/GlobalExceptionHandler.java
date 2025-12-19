package com.example.demo.exception;

import java.lang.RuntimeException;
import com.example.demo.exception.ValidationException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<String> handleValidationException(ValidationExcaption error){
        return new ResponseBody<String>(error.getMessage(),HttpStatus.BAD_GATEWAY);

    }
}
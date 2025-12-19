package com.example.demo.exception;

import java.lang.RuntimeException;
import com.example.demo.exception.ValidationException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<String> handleValidationException(ValidationException error) {
        return new ResponseEntity<>(
                error.getMessage(),
                HttpStatus.BAD_REQUEST
        );
    }
}

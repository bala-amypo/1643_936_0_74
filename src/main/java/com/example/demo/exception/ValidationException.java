package com.example.demo.exception;

import java.lang.RuntimeException;

public class ValidationException extends RuntimeException{
    public ValidationException(String message){
        super(message);

    }
}
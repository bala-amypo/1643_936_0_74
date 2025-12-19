package com.example.demo.exception;

import java.lang.RuntimeException;

public class GlobalExceptionHandler extends RuntimeException{
    public GlobalExceptionHandler(String message){
        super(message);

    }
}
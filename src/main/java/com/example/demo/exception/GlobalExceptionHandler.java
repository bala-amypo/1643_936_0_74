package com.example.demo.exception;

import java.lang.RunTimeException;

public class GlobalExceptionHandler extends RunTimeException{
    public GlobalExceptionHandler(String message){
        super(message);

    }
}
package com.example.demo.exception;

import java.lang.RunTimeException;

public class ResourceNotFoundException extends RunTimeException{
    public ResourceNotFoundException(String message){
        super(message);
        
    }
}
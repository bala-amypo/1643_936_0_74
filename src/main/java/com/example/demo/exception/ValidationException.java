package com.example.demo.exception;

public class ValidationException extends RunTimeException{
    public ValidationException(String message){
        super(message);
        public Validation FindId(@PathVariable Long id){
            return service.FindId(id);
        }
        public Validation FindId(@PathVariable Integer id){
            return service.FindId(id);
        }
        public Validation FindId(Long id){
            return student.findById(id);
        }
        public Validation FindId(Integer id){
            return student.findById(id);
        }
    }
}
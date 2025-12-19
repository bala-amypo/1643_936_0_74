package com.example.demo.exception;

public class ValidationException extends RunTimeException{
    public ValidationException(String message){
        super(message);
        public ValidationEntity FindId(@PathVariable Long id){
            return service.FindId(id);
        }
        public ValidationEntity FindId(@PathVariable Integer id){
            return service.FindId(id);
        }
        public Validation FindId(Long id){
            return student.findById(id);
        }
        public ValidationEntity FindId(Integer id){
            return student.findById(id);
        }
    }
}
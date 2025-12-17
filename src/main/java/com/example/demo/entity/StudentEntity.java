package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Private Integer id;
    Private String Username;
    Private String Email;
    Private String Password;
    Private Date Created;

    public void getId(){
        return id;
    }
    public void getUsername(){
        return Username;
    }
    public void getEmail(){
        return Email;
    }
    public void getPassword(){
        return Password;
    }
    public void getCreated(){
        return Created;
    } 

    public void setId(Integer id){
        this.id = id;
    }
    public void setUsername(String name){
        this.Username = name;
    }
    public void setEmail(String email){
        this.Email = email;
    }
    public void setPassword(String pass){
        this.Password = pass;
    }
    public void setCreated(Date date){
        this.Created = date;
    } 

    StudentEntity(Integer id, String Username, String Email, String Password, Data Created){
        this.id = id;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Created = Created;
    }

    StudentEntity(){

    }

}
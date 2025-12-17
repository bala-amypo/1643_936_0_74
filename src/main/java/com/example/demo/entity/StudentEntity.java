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
    Private Integer Id;
    Private String Username;
    Private String Email;
    Private String Password;
    Private Date Created;

    //Getter Method
    public void getId(){
        return Id;
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

    //Setter Method
    public void setId(Integer id){
        this.Id = id;
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

    //Constructor
    void getAll(Integer Id, String Username, String Email, String Password, Data Created){
        this.Id = Id;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Created = Created;
    }

    //Default Constructor
    void getAll(){

    }

}
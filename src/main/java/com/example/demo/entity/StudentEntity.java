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
    private Integer id;
    private String Username;
    private String Email;
    private String Password;
    private Date Created;

    //Getter Method
    public Integer getId(){
        return id;
    }
    public String getUsername(){
        return Username;
    }
    public String getEmail(){
        return Email;
    }
    public String getPassword(){
        return Password;
    }
    public Date getCreated(){
        return Created;
    } 

    //Setter Method
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


    StudentEntity(Integer id, String Username, String Email, String Password, Date Created){
        this.id = id;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Created = Created;
    }

    
    StudentEntity(){

    }

}


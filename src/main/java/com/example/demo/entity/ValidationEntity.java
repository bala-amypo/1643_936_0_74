package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Max;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=5, max=10, message="Must be atleast 5 to 10 characters")
    private String username;
    @Email(message="Email not valid")
    private String email;
    @NotNull(message="Password is required")
    @Size(max=5, message="Password should be at max 6 letters")
    private String password;
    @NotNull(message="Age is required")
    @Max(30)
    @Positive
    private int age;

    //Getter Method
    public Long getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public int getAge(){
        return age;
    } 

    //Setter Method
    public void setId(Long id){
        this.id = id;
    }
    public void setUsername(String name){
        this.username = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public void setAge(int age){
        this.age = age;
    }

    public ValidationEntity(Long id, 
            @NotNull @Size(min=5, max=10, message="Must be atleast 5 to 10 characters") String username,
            @Email(message="Email not valid") String email,
            @NotNull(message="Password is required") @Size(max=6, message="Password should be at max 6 letters") String password,
            @NotNull(message="Age is required") @Max(30) @Positive int age){
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public ValidationEntity(){

    }
}
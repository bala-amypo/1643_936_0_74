package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
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
    @Max(6)
    private String password;
    @NotNull(message="Age is required")
    @Max(30)
    @Positive
    private int age;

}
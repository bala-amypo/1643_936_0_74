package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Max;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import jakarta.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TimeStamp")

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=5, max=10, message="Must be atleast 5 to 10 characters")
    private String username;
    @Email
    private String email;

    @NotNull(message="Password is required")
    package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.Max;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import jakarta.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TimeStamp")

public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=5, max=10, message="Must be atleast 5 to 10 characters")
    private String username;
    @Email(message="Email not valid")
    private String email;
    @NotNull(message="Password is required")
    private LocalDateTime createdat;
    private LocalDateTime editedat;
    @PrePersist
    public void Oncreate(){
        LocalDateTime now = LocalDateTime().now();
        this.createdat = now;
        this.editedat = now;
    }
    @PreUpdate
    public void Onupdate(){
        LocalDateTime now = LocalDateTime().now();
        this.editedat = now;
    }
}
    @PrePersist
    public void Oncreate(){
        LocalDateTime now = LocalDateTime().now();
        this.createdat = now;
        this.editedat = now;
    }
    @PreUpdate
    public void Onupdate(){
        LocalDateTime now = LocalDateTime().now();
        this.editedat = now;
    }
}
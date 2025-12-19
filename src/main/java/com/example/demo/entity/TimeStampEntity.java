package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "time_stamp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeStampEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 5, max = 10, message = "Must be between 5 and 10 characters")
    private String username;

    @Email
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime editedAt;

    @PrePersist
    public void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.createdAt = now;
        this.editedAt = now;
    }

    @PreUpdate
    public void onUpdate() {
        this.editedAt = LocalDateTime.now();
    }
}

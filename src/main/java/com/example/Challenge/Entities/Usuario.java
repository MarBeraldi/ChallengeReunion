package com.example.Challenge.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Usuario {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "fullname")
    String fullname;
    @Column(name = "email")
    String email;
    @Column(name = "birthdate")
    LocalDate birthdate;
}

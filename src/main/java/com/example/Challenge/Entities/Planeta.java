package com.example.Challenge.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Planeta {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "Nombre", columnDefinition = "VARCHAR(45)")
    String name ="";
    @Column(name = "Terreno", columnDefinition = "VARCHAR(45)")
    String terrain ="";
}

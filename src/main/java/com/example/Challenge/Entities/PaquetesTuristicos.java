package com.example.Challenge.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class PaquetesTuristicos {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombre", columnDefinition = "VARCHAR(45)")
    String nombre ="";
    @Column(name = "descripcion", columnDefinition = "VARCHAR(45)")
    String descripcion = "";
    @Column(name = "cant_noches", columnDefinition = "INT(11)")
    Integer Cant_noches;
    @Column(name = "precio", columnDefinition = "FLOAT")
    Float precio;
    @Column(name = "planeta_destino", columnDefinition = "VARCHAR(45)")
    String planeta_destino="";
}

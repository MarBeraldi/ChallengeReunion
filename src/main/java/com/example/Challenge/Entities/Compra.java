package com.example.Challenge.Entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Compra {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "fecha", columnDefinition = "DATE")
    LocalDate fecha;
    @Column(name = "metodo_pago", columnDefinition = "VARCHAR(45)")
    String metodoPago;
    @Column(name = "idpaquete", columnDefinition = "INT(11)")
    Integer idpaquete;
    @Column(name = "idusuario", columnDefinition = "INT(11)")
    Integer idusuario;
}

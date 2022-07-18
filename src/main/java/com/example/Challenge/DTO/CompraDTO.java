package com.example.Challenge.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraDTO {
    Integer id;
    String fecha;
    String metodo_pago;
    Integer idPaquete;
    Integer idUsuario;

    public CompraDTO(Object ent) {
    }
}

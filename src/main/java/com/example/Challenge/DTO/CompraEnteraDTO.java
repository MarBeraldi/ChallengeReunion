package com.example.Challenge.DTO;

import com.example.Challenge.Entities.PaquetesTuristicos;
import com.example.Challenge.Entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CompraEnteraDTO {
    Integer id;
    LocalDate fecha;
    String metodo_pago;
    PaquetesTuristicos paquete;
    Usuario usuario;
}

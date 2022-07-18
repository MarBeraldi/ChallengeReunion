package com.example.Challenge.Mapper;
import com.example.Challenge.DTO.CompraDTO;
import com.example.Challenge.Entities.Compra;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class CompraMapper {
    public CompraDTO entityToDto(Compra entity){
        return Optional
                .ofNullable(entity)
                .map(
                        ent -> new CompraDTO(
                             ent.getId(),
                             ent.getFecha().toString(),
                             ent.getMetodoPago(),
                             ent.getIdusuario(),
                             ent.getIdpaquete()
                        )
                )
                .orElse(new CompraDTO());
    }

    public Compra DtoToEntity (CompraDTO dto){
        Compra entity = new Compra();
        entity.setId(dto.getId());
        entity.setFecha(LocalDate.parse(dto.getFecha()));
        entity.setMetodoPago(dto.getMetodo_pago());
        entity.setIdpaquete(dto.getIdPaquete());
        entity.setIdusuario(dto.getIdUsuario());
        return entity;
    }


}

package com.example.Challenge.Controller;

import com.example.Challenge.DTO.CompraDTO;
import com.example.Challenge.Entities.Compra;
import com.example.Challenge.Mapper.CompraMapper;
import com.example.Challenge.Services.CompraService;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CompraController {

    private final CompraService compraService;

    public CompraController(CompraService compraService){this.compraService = compraService; }

    @PostMapping()
    public ResponseEntity<CompraDTO> add(@RequestBody CompraDTO entity){
        return ResponseEntity.ok(compraService.add(entity));
    }

}

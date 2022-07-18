package com.example.Challenge.Controller;

import com.example.Challenge.Entities.Planeta;
import com.example.Challenge.Services.PlanetaService;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class PlanetaController {
    //@GetMapping("")
    /*public ResponseEntity<List<Planeta>> getAllPlanetas(){

        PlanetaService planetaService = new PlanetaService();
        //return ResponseEntity.ok(planetaService.)
    }*/
}

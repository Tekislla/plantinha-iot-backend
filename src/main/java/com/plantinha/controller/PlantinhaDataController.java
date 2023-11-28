package com.plantinha.controller;

import com.plantinha.dto.PlantinhaDataDTO;
import com.plantinha.entity.PlantinhaData;
import com.plantinha.service.PlantinhaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/data")
public class PlantinhaDataController {
    @Autowired
    PlantinhaDataService service;

    @PostMapping(value = "/umidade")
    public ResponseEntity<PlantinhaData> criarEventoUmidade(@RequestBody PlantinhaDataDTO dto) {
        try {
            return ResponseEntity.ok(service.criaEventoUmidade(dto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(value = "/temperatura")
    public ResponseEntity<PlantinhaData> criarEventoTemperatura(@RequestBody PlantinhaDataDTO dto) {
        try {
            return ResponseEntity.ok(service.criaEventoTemperatura(dto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(value = "/luminosidade")
    public ResponseEntity<PlantinhaData> criarEventoLuminosidade(@RequestBody PlantinhaDataDTO dto) {
        try {
            return ResponseEntity.ok(service.criaEventoLuminosidade(dto));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<PlantinhaData>> listAllEventos() {
        try {
            return ResponseEntity.ok(service.listAllEventos());
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(value = "/listar/{evento}")
    public ResponseEntity<List<PlantinhaData>> findById(@PathVariable("evento") String evento) {
        try {
            return ResponseEntity.ok(service.listByEvento(evento));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}

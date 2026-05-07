package com.example.elsistemadelossietemares.controller;


import com.example.elsistemadelossietemares.domain.entity.Pirate;
import com.example.elsistemadelossietemares.service.PirateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pirates")
@RequiredArgsConstructor
public class PirateController {
    private final PirateService pirateService;

    @PostMapping
    public ResponseEntity<Pirate> createPirate(@RequestBody Pirate pirate) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(pirateService.createPirate(pirate));
    }

    @GetMapping
    public ResponseEntity<List<Pirate>> getAllPirates() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(pirateService.getAllPirates());
    }

    @GetMapping("/get")
    public ResponseEntity<Pirate> getPirateById(@RequestParam UUID id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(pirateService.getPirateById(id));
    }

    @PutMapping("/id")
    public ResponseEntity<Pirate> updatePirate(
            @RequestParam UUID id,
            @RequestBody Pirate pirate
    ) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(pirateService.updatePirate(id, pirate));
    }

    @DeleteMapping("/ideliminado")
    public ResponseEntity<Void> deletePirate(@RequestParam UUID id) {
        pirateService.deletePirate(id);

        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}

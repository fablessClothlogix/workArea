package com.fabless.clothlogix.controller;

import com.fabless.clothlogix.Service.AbstractColoreService;
import com.fabless.clothlogix.model.entities.ColoreEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/colore")
public class ColoreController {

    private final AbstractColoreService coloreService;

    @Autowired
    public ColoreController(AbstractColoreService coloreService) {
        this.coloreService = coloreService;
    }

    // Ottieni tutti i colori disponibili
    @GetMapping("/listcolori")
    public ResponseEntity<?> getAllColori() {
        Map<String, Object> risposta = new HashMap<>();
        try {
            Iterable<ColoreEntity> colori = coloreService.findAll(risposta);
            return ResponseEntity.ok(colori);
        } catch (Exception e) {
            risposta.put("errore", "Errore nel recuperare i colori: " + e.getMessage());
            return new ResponseEntity<>(risposta, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Ottieni un singolo colore per ID
    @GetMapping("/colore/{id}")
    public ResponseEntity<?> getColoreById(@PathVariable Long id) {
        Map<String, Object> risposta = new HashMap<>();
        try {
            Optional<ColoreEntity> colore = coloreService.findById(id, risposta);
            return colore.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            risposta.put("errore", "Errore nella ricerca del colore con ID: " + id + ", " + e.getMessage());
            return new ResponseEntity<>(risposta, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Crea un nuovo colore
    @PostMapping("/colore/create")
    public ResponseEntity<?> createColore(@RequestBody ColoreEntity coloreEntity) {
        Map<String, Object> risposta = new HashMap<>();
        try {
            coloreService.create(coloreEntity, risposta);
            risposta.put("messaggio", "Colore creato con successo.");
            return ResponseEntity.ok(risposta);
        } catch (Exception e) {
            risposta.put("errore", "Errore nella creazione del colore: " + e.getMessage());
            return new ResponseEntity<>(risposta, HttpStatus.BAD_REQUEST);
        }
    }

    // Aggiorna un colore esistente
    @PutMapping("/colore/update/{id}")
    public ResponseEntity<?> updateColore(@PathVariable Long id, @RequestBody ColoreEntity coloreEntity) {
        Map<String, Object> risposta = new HashMap<>();
        try {
            coloreEntity.setId(id);
            coloreService.upload(coloreEntity, risposta);
            risposta.put("messaggio", "Colore aggiornato con successo.");
            return ResponseEntity.ok(risposta);
        } catch (Exception e) {
            risposta.put("errore", "Errore nell'aggiornamento del colore: " + e.getMessage());
            return new ResponseEntity<>(risposta, HttpStatus.BAD_REQUEST);
        }
    }

    // Elimina un colore
    @DeleteMapping("/colore/delete/{id}")
    public ResponseEntity<?> deleteColore(@PathVariable Long id) {
        Map<String, Object> risposta = new HashMap<>();
        try {
            coloreService.deleteByid(id, risposta);
            risposta.put("messaggio", "Colore eliminato con successo.");
            return ResponseEntity.ok(risposta);
        } catch (Exception e) {
            risposta.put("errore", "Errore nell'eliminazione del colore: " + e.getMessage());
            return new ResponseEntity<>(risposta, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

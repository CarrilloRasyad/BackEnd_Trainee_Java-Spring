package com.project.rs.cobacoba.project_rs_coba.controller;

import com.project.rs.cobacoba.project_rs_coba.model.Penanganan;
import com.project.rs.cobacoba.project_rs_coba.service.PenangananService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/penanganan")
public class PenangananController {
    @Autowired
    private PenangananService penangananService;

    @GetMapping
    public ResponseEntity<List<Penanganan>> getAllPenanganan() {
        return new ResponseEntity<>(penangananService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Penanganan> getPenangananById(@PathVariable("id") Long id) {
        Penanganan penanganan = penangananService.get(id);
        return new ResponseEntity<>(penanganan, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Penanganan>> getPenangananByNamaPasien(@RequestParam("namaPasien") String namaPasien) {
        List<Penanganan> penangananList = penangananService.findByNamaPasien(namaPasien);
        return new ResponseEntity<>(penangananList, HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> addNewPenanganan(@Valid @RequestBody Penanganan penanganan) {
        try {
            String nota = penangananService.addNewPenanganan(penanganan);
            return new ResponseEntity<>(nota, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}

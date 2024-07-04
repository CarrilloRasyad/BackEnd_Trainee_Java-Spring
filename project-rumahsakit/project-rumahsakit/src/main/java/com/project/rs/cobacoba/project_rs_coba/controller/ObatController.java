package com.project.rs.cobacoba.project_rs_coba.controller;

import com.project.rs.cobacoba.project_rs_coba.model.Obat;
import com.project.rs.cobacoba.project_rs_coba.service.ObatService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/obat")

public class ObatController {

    @Autowired
    private ObatService obatService;

    @GetMapping
    public HttpEntity<List<Obat>> getAllObat() {
        return new ResponseEntity<>(obatService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public HttpEntity<Obat> getObatById(@PathVariable("id") String id) {
        Obat obat = obatService.get(id);
        return new ResponseEntity<>(obat, HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public HttpEntity<Obat> addNewObat(@Valid @RequestBody Obat obat) {
        Obat newObat = obatService.save(obat);
        return new ResponseEntity<>(newObat, HttpStatus.CREATED);
    }
}

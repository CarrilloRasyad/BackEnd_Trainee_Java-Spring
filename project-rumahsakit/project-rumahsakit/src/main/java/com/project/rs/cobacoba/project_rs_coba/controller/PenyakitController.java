package com.project.rs.cobacoba.project_rs_coba.controller;


import com.project.rs.cobacoba.project_rs_coba.model.Penyakit;
import com.project.rs.cobacoba.project_rs_coba.service.PenyakitService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/penyakit")

public class PenyakitController {

    @Autowired
    private PenyakitService penyakitService;


    @GetMapping
    public ResponseEntity<List<Penyakit>> getAllPenyakit() {
        return new ResponseEntity<>(penyakitService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Penyakit> getPenyakitById(@PathVariable("id") Long id) {
        Penyakit penyakit = penyakitService.get(id);
        return new ResponseEntity<>(penyakit, HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Penyakit> addNewPenyakit(@Valid @RequestBody Penyakit penyakit) throws Exception {
        Penyakit newPenyakit = penyakitService.save(penyakit);
        return new ResponseEntity<>(newPenyakit, HttpStatus.CREATED);
    }
}
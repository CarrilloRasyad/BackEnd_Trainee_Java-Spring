package com.project.rs.cobacoba.project_rs_coba.controller;

import com.project.rs.cobacoba.project_rs_coba.model.Dokter;
import com.project.rs.cobacoba.project_rs_coba.model.Pasien;
import com.project.rs.cobacoba.project_rs_coba.service.DokterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dokter")
public class DokterController {

    @Autowired
    private DokterService dokterService;

    @GetMapping
    public HttpEntity<List<Dokter>> getAllDokter() {
        List<Dokter> dokterList = dokterService.listAll();
        return new ResponseEntity<>(dokterList, HttpStatus.OK);
//        return new ResponseEntity<>(dokterService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public HttpEntity<Dokter> getDokterById(@PathVariable("id") Long id) {
        Dokter dokter = dokterService.get(id);
        return new ResponseEntity<>(dokter, HttpStatus.OK);
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public HttpEntity<Dokter> addNewDokter(@Valid @RequestBody Dokter dokter) {
        Dokter newDokter = dokterService.save(dokter);
        return new ResponseEntity<>(newDokter, HttpStatus.CREATED);
    }
}
package com.project.rs.cobacoba.project_rs_coba.service;

import com.project.rs.cobacoba.project_rs_coba.model.Dokter;

import java.util.List;

public interface DokterService {
    List<Dokter> listAll();
    Dokter get(Long id);
    Dokter save(Dokter dokter);
}

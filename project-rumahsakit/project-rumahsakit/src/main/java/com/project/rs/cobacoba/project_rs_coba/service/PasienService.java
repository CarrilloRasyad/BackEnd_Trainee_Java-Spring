package com.project.rs.cobacoba.project_rs_coba.service;

import com.project.rs.cobacoba.project_rs_coba.model.Pasien;

import java.util.List;

public interface PasienService {
    List<Pasien> listAll();
    Pasien get(Long id);
    Pasien save(Pasien pasien);
}

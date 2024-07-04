package com.project.rs.cobacoba.project_rs_coba.service;

import com.project.rs.cobacoba.project_rs_coba.model.Penanganan;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface PenangananService {

    List<Penanganan> listAll();
    Penanganan get(Long id);
    Penanganan save(Penanganan penanganan);
    List<Penanganan> findByNamaPasien(String namaPasien);
    String addNewPenanganan(Penanganan penanganan) throws Exception;
}

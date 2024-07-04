package com.project.rs.cobacoba.project_rs_coba.service;

import com.project.rs.cobacoba.project_rs_coba.model.Obat;

import java.util.List;

public interface ObatService {
    List<Obat> listAll();
    Obat get(String id);
    Obat save(Obat obat);
}

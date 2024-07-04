package com.project.rs.cobacoba.project_rs_coba.service;


import com.project.rs.cobacoba.project_rs_coba.model.Penyakit;

import java.util.List;

public interface PenyakitService {
    List<Penyakit> listAll();
    Penyakit get(Long id);
    Penyakit save(Penyakit penyakit) throws Exception;
}

package com.project.rs.cobacoba.project_rs_coba.service.impl;

import com.project.rs.cobacoba.project_rs_coba.model.Pasien;
import com.project.rs.cobacoba.project_rs_coba.model.Penyakit;
import com.project.rs.cobacoba.project_rs_coba.repository.PasienRepository;
import com.project.rs.cobacoba.project_rs_coba.repository.PenyakitRepository;
import com.project.rs.cobacoba.project_rs_coba.service.PasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasienServiceImpl implements PasienService {
    @Autowired
    private PasienRepository pasienRepository;

    @Autowired
    private PenyakitRepository penyakitRepository;

    @Override
    public List<Pasien> listAll() {
        return pasienRepository.findAll();
    }

    @Override
    public Pasien get(Long id) {
        return pasienRepository.findById(id).orElse(null);
    }

    @Override
    public Pasien save(Pasien pasien) {
        Penyakit penyakit1 = penyakitRepository.findById(pasien.getPenyakit().getId()).get();
        pasien.setPenyakit(penyakit1);
        return pasienRepository.save(pasien);
    }
}

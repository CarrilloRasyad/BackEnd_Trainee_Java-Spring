package com.project.rs.cobacoba.project_rs_coba.service.impl;

import com.project.rs.cobacoba.project_rs_coba.model.Dokter;
import com.project.rs.cobacoba.project_rs_coba.repository.DokterRepository;
import com.project.rs.cobacoba.project_rs_coba.service.DokterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DokterServiceImpl implements DokterService {
    @Autowired
    private DokterRepository dokterRepository;

    @Override
    public List<Dokter> listAll() {
        return dokterRepository.findAll();
    }

    @Override
    public Dokter get(Long id) {
        return dokterRepository.findById(id).orElse(null);
    }

    @Override
    public Dokter save(Dokter dokter) {
        return dokterRepository.save(dokter);
    }
}

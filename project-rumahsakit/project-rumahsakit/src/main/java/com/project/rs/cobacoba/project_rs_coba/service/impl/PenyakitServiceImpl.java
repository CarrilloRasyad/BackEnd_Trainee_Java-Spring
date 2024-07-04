package com.project.rs.cobacoba.project_rs_coba.service.impl;

import com.project.rs.cobacoba.project_rs_coba.model.Obat;
import com.project.rs.cobacoba.project_rs_coba.model.Penyakit;
import com.project.rs.cobacoba.project_rs_coba.repository.ObatRepository;
import com.project.rs.cobacoba.project_rs_coba.repository.PenyakitRepository;
import com.project.rs.cobacoba.project_rs_coba.service.PenyakitService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class PenyakitServiceImpl implements PenyakitService {

    @Autowired
    private PenyakitRepository penyakitRepository;

    @Autowired
    private ObatRepository obatRepository;

    @Override
    public List<Penyakit> listAll() {
        return penyakitRepository.findAll();
    }

    @Override
    public Penyakit get(Long id) {
        return penyakitRepository.findById(id).orElse(null);
    }

    @Override
    public Penyakit save(Penyakit penyakit) {
        Obat obatt = obatRepository.findById(penyakit.getObat().getNamaObat()).get();
        penyakit.setObat(obatt);
        return penyakitRepository.save(penyakit);
    }
}
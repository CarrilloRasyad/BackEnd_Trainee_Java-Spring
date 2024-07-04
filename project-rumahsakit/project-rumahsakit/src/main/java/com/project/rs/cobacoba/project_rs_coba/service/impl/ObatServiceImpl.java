package com.project.rs.cobacoba.project_rs_coba.service.impl;

import com.project.rs.cobacoba.project_rs_coba.model.Obat;
import com.project.rs.cobacoba.project_rs_coba.repository.ObatRepository;
import com.project.rs.cobacoba.project_rs_coba.service.ObatService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ObatServiceImpl implements ObatService {

    @Autowired
    private ObatRepository obatRepository;

    @Override
    public List<Obat> listAll() {
        return obatRepository.findAll();
    }

    @Override
    public Obat get(String id) {
        return obatRepository.findById(id).orElse(null);
    }

    @Override
    public Obat save(Obat obat) {
        return obatRepository.save(obat);
    }
}

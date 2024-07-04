package com.project.rs.cobacoba.project_rs_coba.repository;

import com.project.rs.cobacoba.project_rs_coba.model.Penanganan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PenangananRepository extends JpaRepository<Penanganan, Long> {
    List<Penanganan> findByPasienNamaPasien(String namaPasien);
}

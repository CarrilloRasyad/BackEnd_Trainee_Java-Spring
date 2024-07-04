package com.project.rs.cobacoba.project_rs_coba.repository;

import com.project.rs.cobacoba.project_rs_coba.model.Pasien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PasienRepository extends JpaRepository<Pasien, Long> {
}

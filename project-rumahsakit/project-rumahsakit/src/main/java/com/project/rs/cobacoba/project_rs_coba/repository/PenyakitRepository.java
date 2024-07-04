package com.project.rs.cobacoba.project_rs_coba.repository;

import com.project.rs.cobacoba.project_rs_coba.model.Penyakit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenyakitRepository extends JpaRepository<Penyakit, Long> {

}
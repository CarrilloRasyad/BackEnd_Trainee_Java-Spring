package com.project.rs.cobacoba.project_rs_coba.repository;

import com.project.rs.cobacoba.project_rs_coba.model.Dokter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DokterRepository extends JpaRepository<Dokter, Long> {

}

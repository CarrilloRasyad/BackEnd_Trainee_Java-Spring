package com.project.rs.cobacoba.project_rs_coba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "obat")
public class Obat {
    @Id
    private String namaObat;
    private float hargaObat;
}
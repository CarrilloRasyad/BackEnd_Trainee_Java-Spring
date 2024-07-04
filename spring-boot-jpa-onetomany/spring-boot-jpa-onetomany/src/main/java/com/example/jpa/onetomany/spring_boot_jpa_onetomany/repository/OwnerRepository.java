package com.example.jpa.onetomany.spring_boot_jpa_onetomany.repository;

import com.example.jpa.onetomany.spring_boot_jpa_onetomany.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}

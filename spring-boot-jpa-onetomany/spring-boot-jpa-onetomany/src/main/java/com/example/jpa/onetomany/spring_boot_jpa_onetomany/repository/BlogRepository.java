package com.example.jpa.onetomany.spring_boot_jpa_onetomany.repository;

import com.example.jpa.onetomany.spring_boot_jpa_onetomany.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {
}

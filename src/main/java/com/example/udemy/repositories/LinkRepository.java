package com.example.udemy.repositories;

import com.example.udemy.models.Link;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LinkRepository extends JpaRepository<Link, Long> {
    //Link findByTitle(String title);
}

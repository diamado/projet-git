package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventaire.entities.Departement;


public interface DepartementRepository extends JpaRepository <Departement, Long> {
    
}
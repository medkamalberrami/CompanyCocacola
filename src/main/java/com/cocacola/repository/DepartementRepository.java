package com.cocacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocacola.model.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}

package com.cocacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocacola.model.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {

}

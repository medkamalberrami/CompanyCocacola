package com.cocacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cocacola.model.Employed;

@Repository
public interface EmployedRepository extends JpaRepository<Employed, Integer> {

}

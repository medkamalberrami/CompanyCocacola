package com.cocacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocacola.model.Employed;

public interface EmployedRepository extends JpaRepository<Employed, Integer> {

}

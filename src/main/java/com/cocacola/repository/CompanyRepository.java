package com.cocacola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cocacola.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}

package com.cocacola.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Company {
	
	
	@Id
	private Integer idCompany;
	
	private String nameCompany;
	@OneToMany
	private List<Departement> depatement;

}

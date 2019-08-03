package com.cocacola.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Departement {
	
	
	@Id
	private Integer idDepartement;

	private String nameDepartement;
	@OneToOne
	private Company company;
	
	


}

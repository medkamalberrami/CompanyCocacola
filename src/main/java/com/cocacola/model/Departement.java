package com.cocacola.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
	@OneToMany
	private List<Employed> employed;


}

package com.cocacola.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Departement {
	
	
	@Id
	private Integer idDepartement;

	private String nameDepartement;
	
	private Company company;
	
	private List<Employed> employeds;


}

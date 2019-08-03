package com.cocacola.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Departement {
	
	
	
	private Integer idDepartement;

	private String nameDepartement;
	
	private Company company;


}

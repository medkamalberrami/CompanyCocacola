package com.cocacola.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Departement {
	
	
	
	private Integer idDepartement;

	private String nameDepartement;
	
	private Company company;
	
	private List<Employed> employeds;


}

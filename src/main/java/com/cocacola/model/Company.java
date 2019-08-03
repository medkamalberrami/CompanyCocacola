package com.cocacola.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
	
	
	
	private Integer idCompany;
	
	private String nameCompany;

	private List<Departement> depatement;

}

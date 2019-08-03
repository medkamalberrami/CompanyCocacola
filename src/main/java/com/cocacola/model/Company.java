package com.cocacola.model;

import java.util.List;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
	
	
	@Id
	private Integer idCompany;
	
	private String nameCompany;

	private List<Departement> depatement;

}

package com.cocacola.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Company {
	
	
	@Id
	private Integer idCompany;
	
	private String nameCompany;
	
	
	public Company() {
	}
}

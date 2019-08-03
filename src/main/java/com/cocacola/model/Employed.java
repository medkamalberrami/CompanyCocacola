package com.cocacola.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Employed {
	
	@Id
	private Integer idEmp;
	private String nameEmp;
	private String typeEmp;
	private Double SalaryEmp;
	private String userName;
	private String password;
	@OneToOne
	private Departement departement;


}

package com.cocacola.model;

import javax.persistence.Entity;
import javax.persistence.Id;

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


}

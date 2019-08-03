package com.cocacola.service;

import org.springframework.stereotype.Service;

import com.cocacola.model.Company;

@Service
public class CompanyServiceImp implements CompanyService {

	@Override
	public Company saveCompany(Company company) {
		
		if(company != null && company.getIdCompany() !=null)
		{
			
			if(company.getNameCompany().length()>4) {
				
				
				
			}
				
			else 
				return new Company();
				
			
		}
		else 
			return new Company();
		
		
		return company;
	}
	
	
	
	


}

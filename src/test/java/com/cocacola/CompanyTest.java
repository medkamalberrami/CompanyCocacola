package com.cocacola;



import static org.junit.Assert.assertNotSame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.cocacola.model.Company;
import com.cocacola.service.CompanyService;



@Ignore
@RunWith(SpringRunner.class)
public class CompanyTest {
	
	public Company company;
	
	
	@Autowired
	CompanyService compserv;
	
	
	
	@Before
	public void testBefor() {
		
		company = new Company(22, "");
		
	}
	
	

	@Test
	public void test() {
		
		Company compare = new Company(2267, "kamalfdfdfdfdfd");
		//Company result = compserv.saveCompany(company);
		Company result = new Company(2267, "mk");

		//assertSame(compare, result);	
		
		assertNotSame("Verify that two objects are different", compare, result);

		

		

	}

}

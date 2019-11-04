package com.example.demo.services.company;

import java.util.List;
import java.util.Optional;

import com.example.demo.domains.Company;


public interface CompanyDAL {

	List<Company> getAllCompany();
	
	Optional <Company> getCompanyById(String c_id);
	 Company addNewCompany(Company com);
	 
	boolean IsCompanyIsExsists(String s);
}

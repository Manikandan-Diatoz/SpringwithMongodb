package com.example.demo.services.company;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.domains.Company;
import com.example.demo.repositories.Company_Resp;



@Service

public class CompanyImpls implements CompanyDAL {
	
	@Autowired
	private MongoTemplate mtemp;
	
	@Autowired
	private Company_Resp cmpres;
//	@Autowired
//	private Company com;
	public Optional <Company> getCompanyById(String c_id)
	{
		 	return cmpres.findById(c_id);
		 	
		 
	}
	public List<Company>getAllCompany()
	{
		return mtemp.findAll(Company.class);
	}
	

	
	
	public Company addNewCompany(Company com)
	{
	
		return mtemp.save(com);
				
	}
	
		
	public boolean IsCompanyIsExsists(String s)
	{
		return cmpres.existsById(s);
	}
		
	

}

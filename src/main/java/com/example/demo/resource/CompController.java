package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domains.Company;
import com.example.demo.services.company.CompanyDAL;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("api/company")
@Api(value = "CompanyControllerAPI")
//@RequestMapping("/")

public class CompController {

	@Autowired
	private CompanyDAL comDal;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Company> getAllCompany()
	{
		return comDal.getAllCompany();
	} 	
	@RequestMapping(value = "/admin/{c_id}", method = RequestMethod.GET)
	public Optional <Company> getCompanyById(@PathVariable String c_id) {
			
		Optional <Company> u;
			return u=  comDal.getCompanyById(c_id);
			
	}
	
	@RequestMapping(value="/admin/create",method=RequestMethod.POST)
	public Company addNewCompany(@RequestBody Company com)
	{
		return comDal.addNewCompany(com);
		 
	}
	
}

package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domains.Company;
@Repository
public interface Company_Resp extends MongoRepository<Company, String>

{
	
	
}

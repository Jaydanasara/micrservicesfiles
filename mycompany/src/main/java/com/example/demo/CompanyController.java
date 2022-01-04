package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Company;
import com.example.demo.service.ICompanyService;




@RestController

public class CompanyController {
	
	@Autowired
ICompanyService companyService;
	
	@PostMapping("/company")
	@ResponseStatus(code= HttpStatus.CREATED)
	String createCompany(@RequestBody Company company) {
		companyService.createCompany(company);
		return company.getCompanyName()+ company.getCEO();
	}
	
	@GetMapping("/company")
	List<Company> getAllCompanies(){
		return companyService.getAllCompanies();
	}
	
	
	@PutMapping("/company/{id}")
	void updateCompany(@RequestBody Company company,@PathVariable Integer id) {
		companyService.updateCompany(company, id);
	}
	
	
	@DeleteMapping("/company/{id}")
	void deleteComany(@PathVariable Integer id) {
		companyService.deleteCompany(id);
	}
	
	

}

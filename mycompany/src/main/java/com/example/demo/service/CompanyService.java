package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
@Service
public class CompanyService implements ICompanyService {
@Autowired
CompanyRepository repository;
	@Override
	public List<Company> getAllCompanies() {
		return repository.findAll();
		
	}

	@Override
	public String createCompany(Company company) {
		repository.save(company);
		return company.getCEO();
	}

	@Override
	public void updateCompany(Company company, Integer id) {
		company.setId(id);
		repository.save(company);
		
	}

	@Override
	public void deleteCompany(Integer id) {
		repository.deleteById(id);
		
	}

}

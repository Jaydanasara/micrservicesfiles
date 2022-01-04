package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Company;

public interface ICompanyService {
 public List<Company> getAllCompanies();
 
 public String createCompany(Company company);
 
 public void updateCompany(Company company,Integer id);
 
 public void deleteCompany(Integer id);
}

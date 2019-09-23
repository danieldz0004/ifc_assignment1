package com.example.demo.service;

import com.example.demo.model.Company;

import java.util.List;

public interface CompanyService {
    // save
    Company saveCompany(Company company);
    // update
    Company updateCompany(Company company);
    // read all
    List<Company> getAllCompany();
    // read by id
    Company getCompany(String company);
    // delete by id
    void deleteCompany(String company);
    // find by company name
    Company findByCompanyName(String name);
}

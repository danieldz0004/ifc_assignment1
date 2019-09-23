package com.example.demo.service.serviceImpl;

import com.example.demo.dao.CompanyRepo;
import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyRepo companyRepo;

    @Override
    public Company saveCompany(Company company) {
        return companyRepo.save(company);
    }

    @Override
    public Company updateCompany(Company company) {
        return companyRepo.saveAndFlush(company);
    }

    @Override
    public List<Company> getAllCompany() {
        return companyRepo.findAll();
    }

    @Override
    public Company getCompany(String company) {
        return companyRepo.findById(company).orElse(new Company());
    }

    @Override
    public void deleteCompany(String company) {
        companyRepo.deleteById(company);
    }

    @Override
    public Company findByCompanyName(String name)
    {
        return companyRepo.findByCompanyName(name);
    }
}

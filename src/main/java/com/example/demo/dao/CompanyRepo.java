package com.example.demo.dao;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String> {
    Company findByCompanyName(String name);
}

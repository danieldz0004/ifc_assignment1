package com.example.demo.dao;

import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends JpaRepository<Company, String> {
    @Query("SELECT c FROM Company c WHERE c.name = ?1")
    Company findByCompanyName(String name);
}

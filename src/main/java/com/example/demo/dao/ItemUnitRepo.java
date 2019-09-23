package com.example.demo.dao;

import com.example.demo.model.Company;
import com.example.demo.model.Item;
import com.example.demo.model.ItemUnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemUnitRepo extends JpaRepository<ItemUnitOfMeasure, Long> {

    //List<ItemUnitOfMeasure> findByItemItem(String item);

    @Query("SELECT i FROM ItemUnitOfMeasure i WHERE i.company = ?1 AND i.item = ?2")
    List<ItemUnitOfMeasure> findByItemAndCompany(String company, String item);
//    List<ItemUnitOfMeasure> findByItemItemAndCompanyCompany(Company company, Item item);


}

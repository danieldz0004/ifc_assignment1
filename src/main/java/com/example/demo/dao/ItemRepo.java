package com.example.demo.dao;

import com.example.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {
    @Query("SELECT i FROM Item i where i.item = ?1 and i.company = ?2")
    Item findByItemAndCompany(String item, String company);

}

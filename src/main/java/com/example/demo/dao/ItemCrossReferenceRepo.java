package com.example.demo.dao;

import com.example.demo.model.ItemCrossReference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemCrossReferenceRepo extends JpaRepository<ItemCrossReference, Long> {
    @Query("SELECT i FROM ItemCrossReference i where i.item=?1 and i.company=?2")
    List<ItemCrossReference> findByItemAndCompany(String item, String company);
}

package com.example.demo.dao;

import com.example.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepo extends JpaRepository<Item, Long> {
    @Query("FROM Item where item = ?1")
    List<Item> findByItemItem(String item);

}

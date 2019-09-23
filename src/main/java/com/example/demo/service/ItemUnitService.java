package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.model.Item;
import com.example.demo.model.ItemUnitOfMeasure;

import java.util.List;

public interface ItemUnitService {
    // save
    ItemUnitOfMeasure saveItemUnitOfMeasure(ItemUnitOfMeasure itemUnitOfMeasure);
    // update
    ItemUnitOfMeasure updateItemUnitOfMeasure(ItemUnitOfMeasure itemUnitOfMeasure);
    // read all
    List<ItemUnitOfMeasure> getAllItemUnitOfMeasure();
    // read by id
    ItemUnitOfMeasure getItemUnitOfMeasure(long internalItemUm);
    // delete by id
    void deleteItemUnitOfMeasure(long internalItemUm);
    // find by item name
//    List<ItemUnitOfMeasure> findByItemItem(String item);
    //find by item name and company
    List<ItemUnitOfMeasure> findByItemAndCompany(String company, String item);
}

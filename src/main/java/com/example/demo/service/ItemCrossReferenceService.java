package com.example.demo.service;

import com.example.demo.model.ItemCrossReference;

import java.util.List;

public interface ItemCrossReferenceService {
    // save
    ItemCrossReference saveItemCrossReference(ItemCrossReference itemCrossReference);
    // update
    ItemCrossReference updateItemCrossReference(ItemCrossReference itemCrossReference);
    // read all
    List<ItemCrossReference> getAllItemCrossReference();
    // read by id
    ItemCrossReference getItemCrossReference(long internalItemCrossReferenceUm);
    // delete by id
    void deleteItemCrossReference(long internalItemCrossReferenceUm);
    // find by item and company
    ItemCrossReference findByItemAndCompanyAndItemUm(String item, String company, String quantityUm);
}

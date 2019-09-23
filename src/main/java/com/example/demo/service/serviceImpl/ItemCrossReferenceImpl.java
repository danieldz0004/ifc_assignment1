package com.example.demo.service.serviceImpl;

import com.example.demo.dao.ItemCrossReferenceRepo;
import com.example.demo.model.ItemCrossReference;
import com.example.demo.service.ItemCrossReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCrossReferenceImpl implements ItemCrossReferenceService {

    @Autowired
    private ItemCrossReferenceRepo itemCrossReferenceRepo;


    @Override
    public ItemCrossReference saveItemCrossReference(ItemCrossReference itemCrossReference) {
        return itemCrossReferenceRepo.save(itemCrossReference);
    }

    @Override
    public ItemCrossReference updateItemCrossReference(ItemCrossReference itemCrossReference) {
        return itemCrossReferenceRepo.saveAndFlush(itemCrossReference);
    }

    @Override
    public List<ItemCrossReference> getAllItemCrossReference() {
        return itemCrossReferenceRepo.findAll();
    }

    @Override
    public ItemCrossReference getItemCrossReference(long internalItemCrossReferenceUm) {
        return itemCrossReferenceRepo.findById(internalItemCrossReferenceUm).orElse(new ItemCrossReference());
    }

    @Override
    public void deleteItemCrossReference(long internalItemCrossReferenceUm) {
        itemCrossReferenceRepo.deleteById(internalItemCrossReferenceUm);
    }

    @Override
    public ItemCrossReference findByItemAndCompanyAndItemUm(String item, String company, String quantityUm) {
        return itemCrossReferenceRepo.findByItemAndCompanyAndItemUm(item, company, quantityUm);
    }
}

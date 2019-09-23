package com.example.demo.service.serviceImpl;

import com.example.demo.dao.ItemUnitRepo;
import com.example.demo.model.Company;
import com.example.demo.model.Item;
import com.example.demo.model.ItemUnitOfMeasure;
import com.example.demo.service.ItemUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemUnitServiceImpl implements ItemUnitService {

    @Autowired
    private ItemUnitRepo itemUnitRepo;

    @Override
    public ItemUnitOfMeasure saveItemUnitOfMeasure(ItemUnitOfMeasure itemUnitOfMeasure) {
        return itemUnitRepo.save(itemUnitOfMeasure);
    }

    @Override
    public ItemUnitOfMeasure updateItemUnitOfMeasure(ItemUnitOfMeasure itemUnitOfMeasure) {
        return itemUnitRepo.saveAndFlush(itemUnitOfMeasure);
    }

    @Override
    public List<ItemUnitOfMeasure> getAllItemUnitOfMeasure() {
        return itemUnitRepo.findAll();
    }

    @Override
    public ItemUnitOfMeasure getItemUnitOfMeasure(long internalItemUm) {
        return itemUnitRepo.findById(internalItemUm).orElse(new ItemUnitOfMeasure());
    }

    @Override
    public void deleteItemUnitOfMeasure(long internalItemUm) {
        itemUnitRepo.deleteById(internalItemUm);
    }

//    @Override
//    public List<ItemUnitOfMeasure> findByItemItem(String item) {
//        return itemUnitRepo.findByItemItem(item);
//    }

    @Override
    public List<ItemUnitOfMeasure> findByItemAndCompany(String company, String item) {
        return itemUnitRepo.findByItemAndCompany(company, item);
    }
}

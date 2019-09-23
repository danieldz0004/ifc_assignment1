package com.example.demo.service.serviceImpl;

import com.example.demo.dao.ItemRepo;
import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepo itemRepo;

    @Override
    public Item saveItem(Item item) {
        return itemRepo.save(item);
    }

    @Override
    public Item updateItem(Item item) {
        return itemRepo.saveAndFlush(item);
    }

    @Override
    public List<Item> getAllItem() {
        return itemRepo.findAll();
    }

    @Override
    public Item getItem(long internalItemUm) {
        return itemRepo.findById(internalItemUm).orElse(new Item());
    }

    @Override
    public void deleteItem(long internalItemUm) {
        itemRepo.deleteById(internalItemUm);
    }

    @Override
    public List<Item> findByItemItem(String item) {
        return itemRepo.findByItemItem(item);
    }
}

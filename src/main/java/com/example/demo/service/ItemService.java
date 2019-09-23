package com.example.demo.service;

import com.example.demo.model.Item;

import java.util.List;

public interface ItemService {
    // save
    Item saveItem(Item item);
    // update
    Item updateItem(Item item);
    // read all
    List<Item> getAllItem();
    // read by id
    Item getItem(long internalItemUm);
    // delete by id
    void deleteItem(long internalItemUm);
    // find by item
    List<Item> findByItemItem(String item);
}

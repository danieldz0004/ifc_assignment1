package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.model.Company;
import com.example.demo.model.Item;
import com.example.demo.model.ItemCrossReference;
import com.example.demo.model.ItemUnitOfMeasure;
import com.example.demo.service.CompanyService;
import com.example.demo.service.ItemCrossReferenceService;
import com.example.demo.service.ItemService;
import com.example.demo.service.ItemUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemUnitOfMeasureController {

    @Autowired
    private ItemUnitService itemUnitService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private ItemCrossReferenceService itemCrossReferenceService;

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }

    @GetMapping(value = "getItemUnitByCompanyAndItem")
    public ModelAndView getItemUnitByCompanyAndItem(@RequestParam String company, @RequestParam String item)
    {
        // init view
        ModelAndView mv = new ModelAndView("home");

        Company companyObject = companyService.findByCompanyName(company);
        // get company id by company name
        String companyId = companyObject.getCompany();

        // find item description
        Item newItem = itemService.findByItemAndCompany(item, companyId);
        String itemDescription = newItem.getDescription();
        mv.addObject("description", itemDescription);

        // find unit of measure by item and company ID
        List<ItemUnitOfMeasure> itemUnitList = itemUnitService.findByItemAndCompany(companyId, item);

        ArrayList<String> barcodeList = new ArrayList<>();
        // find cross reference by item and company ID
        List<ItemCrossReference> itemList = itemCrossReferenceService.findByItemAndCompany(item, companyId);

        if (itemList.size() != 0) {
            ItemCrossReference foundItemUnit = itemList.get(0);
            String barcode = foundItemUnit.getxRefItem();
            barcodeList.add(barcode);
        }

        for (String str : barcodeList) {
            System.out.println(str);
        }

        Object itemInJson = JSON.toJSON(itemUnitList.toString());
        mv.addObject("itemUnit", itemUnitList.get(0));
        mv.addObject("barcode", barcodeList.get(0));


        return mv;
    }
}

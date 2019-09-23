package com.example.demo.controller;

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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        // find all barcode
        Map<ItemUnitOfMeasure, String> itemBarcodeMap = new HashMap<>();
        for (ItemUnitOfMeasure itemUnitOfMeasure : itemUnitList) {
            String barcode = "";
            String ItemUOM = itemUnitOfMeasure.getQuantityUm();
            ItemCrossReference itemCrossReference = itemCrossReferenceService.findByItemAndCompanyAndItemUm(item, companyId, ItemUOM);
            barcode = itemCrossReference != null ? itemCrossReference.getxRefItem() : "";
            itemBarcodeMap.put(itemUnitOfMeasure, barcode);
        }

//        Object itemInJson = JSON.toJSON(itemUnitList.toString());
        mv.addObject("itemUnitMap", itemBarcodeMap);

        return mv;
    }
}

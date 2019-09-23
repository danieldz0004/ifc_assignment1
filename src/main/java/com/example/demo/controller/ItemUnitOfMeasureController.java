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

    @GetMapping(value = "getItemUnitById")
    public ModelAndView getItemUnitById(@RequestParam long internalItemUm)
    {
        ModelAndView mv = new ModelAndView("showItemUnitOfMeasure");
        ItemUnitOfMeasure itemUnit =  itemUnitService.getItemUnitOfMeasure(internalItemUm);
        mv.addObject("itemUnit", JSON.toJSON(itemUnit));
        return mv;
    }

//    @GetMapping(value = "getItemUnitByItem")
//    public ModelAndView getItemUnitByItem(@RequestParam String item)
//    {
//        ModelAndView mv = new ModelAndView("showItemUnitOfMeasure");
//        List<ItemUnitOfMeasure> itemUnitList =  itemUnitService.findByItemItem(item);
//        mv.addObject("itemUnit", JSON.toJSON(itemUnitList.toString()));
//        return mv;
//    }


    @GetMapping(value = "getItemUnitByCompanyAndItem")
    public ModelAndView getItemUnitByCompanyAndItem(@RequestParam String company, @RequestParam String item)
    {
        
        ModelAndView mv = new ModelAndView("home");
        List<ItemUnitOfMeasure> itemUnitList =  itemUnitService.findByItemAndCompany(company, item);

        ArrayList<String> barcodeList = new ArrayList<>();
        List<ItemCrossReference> itemList = itemCrossReferenceService.findByItemAndCompany(item, company);
        if (itemList.size() != 0)
        {
            ItemCrossReference foundItemUnit = itemList.get(0);
            String barcode = foundItemUnit.getxRefItem();
            barcodeList.add(barcode);
        }

        for (String str:barcodeList)
        {
            System.out.println(str);
        }

        Object itemInJson = JSON.toJSON(itemUnitList.toString());
        mv.addObject("itemUnit", itemInJson);

        return mv;
    }
}

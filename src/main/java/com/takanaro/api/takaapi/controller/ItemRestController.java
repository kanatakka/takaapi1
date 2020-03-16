package com.takanaro.api.takaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takanaro.api.takaapi.domain.Item;
import com.takanaro.api.takaapi.service.ItemService;


@RestController
@RequestMapping("items")
public class ItemRestController {
    @Autowired
    ItemService itemService;
    
    @GetMapping
    List<Item> getItems() {
        List<Item> customers = itemService.findAll();
        return customers;
    }

}
package com.joon.study.elasticSearch.controller;

import com.joon.study.elasticSearch.domain.Item;
import com.joon.study.elasticSearch.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ItemController {

    private ItemService itemService;


    @GetMapping("/item")
    public Iterable<Item> getAllItem(){

        return itemService.getAllItem();
    }

    @PostMapping("/item")
    public Item insertItem(@RequestBody Item item){

        return itemService.insertItem(item);
    }
}

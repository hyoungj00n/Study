package org.test.elasticSearch.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.test.elasticSearch.domain.Item;
import org.test.elasticSearch.service.ItemService;

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

package com.joon.study.elasticSearch.service;

import com.joon.study.elasticSearch.domain.Item;
import com.joon.study.elasticSearch.repository.ItemElasticSearchRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ItemService {

    private final ItemElasticSearchRepository itemElasticSearchRepository;

    public Iterable<Item> getAllItem(){
        return itemElasticSearchRepository.findAll();
    }

    public Item insertItem(Item item){
        return itemElasticSearchRepository.save(item);
    }

}

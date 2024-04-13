package org.test.elasticSearch.service;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.elasticSearch.domain.Item;
import org.test.elasticSearch.repository.ItemElasticSearchRepository;

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

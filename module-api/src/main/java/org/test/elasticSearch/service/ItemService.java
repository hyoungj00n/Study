package org.test.elasticSearch.service;


import lombok.AllArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.test.elasticSearch.domain.Item;
import org.test.elasticSearch.domain.elasticsearch.ItemDocument;
import org.test.elasticSearch.elasticRepository.ItemElasticSearchRepository;
import org.test.elasticSearch.repository.ItemRepository;

import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ItemService {

    private final ElasticsearchRestTemplate elasticsearchTemplate;
    private final ItemElasticSearchRepository itemElasticSearchRepository;
    private final ItemRepository itemRepository;

    public void save(){
        Item item = itemRepository.findById(1L).orElseThrow();
        itemElasticSearchRepository.save(ItemDocument.from(item));
    }


}

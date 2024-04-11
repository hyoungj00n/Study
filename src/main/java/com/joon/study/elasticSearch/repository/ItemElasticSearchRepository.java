package com.joon.study.elasticSearch.repository;

import com.joon.study.elasticSearch.domain.Item;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemElasticSearchRepository extends ElasticsearchRepository<Item, Long> {
    SearchHits<Item> findByName(String name);
}

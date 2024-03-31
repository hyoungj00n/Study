package com.joon.study.elasticSearch.repository;

import com.joon.study.elasticSearch.domain.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends ElasticsearchRepository<Item, Long>, JpaRepository<Item, Long> {

}

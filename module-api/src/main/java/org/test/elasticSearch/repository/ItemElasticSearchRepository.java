package org.test.elasticSearch.repository;

import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.test.elasticSearch.domain.Item;

public interface ItemElasticSearchRepository extends ElasticsearchRepository<Item, Long> {
    SearchHits<Item> findByName(String name);
}

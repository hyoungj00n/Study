package org.test.elasticSearch.elasticRepository;

import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import org.springframework.stereotype.Repository;
import org.test.elasticSearch.domain.elasticsearch.ItemDocument;

@Repository("elasticSearchRepository")
public interface ItemElasticSearchRepository extends ElasticsearchRepository<ItemDocument, Long> {
}

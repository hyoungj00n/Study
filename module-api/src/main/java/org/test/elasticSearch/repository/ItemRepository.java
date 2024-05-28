package org.test.elasticSearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.elasticSearch.domain.Item;

@Repository("jpaRepository")
public interface ItemRepository extends JpaRepository<Item, Long> {
}

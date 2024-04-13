package org.test.elasticSearch.domain;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Document(indexName = "item")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private String id;

    @Field(type = FieldType.Long, index = false, docValues = false)
    private Long itemId;

    @Column(nullable = false, length = 300)
    @Field(type = FieldType.Text, analyzer = "nori")
    private String name;

    @Column(length = 6)
    @Field(type = FieldType.Long, index = false)
    private Integer stock;

    @Field(type = FieldType.Long, index = false)
    private Long price;
}

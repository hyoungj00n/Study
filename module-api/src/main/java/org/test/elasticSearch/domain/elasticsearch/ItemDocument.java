package org.test.elasticSearch.domain.elasticsearch;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.test.elasticSearch.domain.DeliveryType;
import org.test.elasticSearch.domain.Item;
import org.test.elasticSearch.domain.ItemStatus;

import javax.persistence.Column;
import java.time.LocalDate;

@Document(indexName = "item")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Data
public class ItemDocument {

    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "standard")
    private String name;

    @Field(type = FieldType.Keyword)
    private ItemStatus status;

    @Field(type = FieldType.Integer)
    private Integer stock;

    @Field(type = FieldType.Long)
    private Long price;

    @Field(type = FieldType.Integer)
    private Integer deliveryFee;

    @Field(type = FieldType.Keyword)
    private DeliveryType deliveryType;

    @Field(type = FieldType.Integer)
    private Integer deliveryDate;

    @Field(type = FieldType.Text)
    private String description;

    @Field(type = FieldType.Boolean)
    private Boolean isLimitless;

    @Field(type = FieldType.Date)
    private LocalDate startDate;

    @Field(type = FieldType.Date)
    private LocalDate endDate;

    @Field(type = FieldType.Long)
    private Long viewCount;

    @Field(type = FieldType.Long)
    private Long dibsCount;

    @Field(type = FieldType.Long)
    private Long salesCount;

    @Field(type = FieldType.Integer)
    private Integer tagsCount;

    @Field(type = FieldType.Date)
    private LocalDate createdAt;

    @Field(type = FieldType.Date)
    private LocalDate updatedAt;

    public static ItemDocument from(Item item){
        return ItemDocument.builder()
                .id(item.getId())
                .deliveryDate(item.getDeliveryDate())
                .deliveryFee(item.getDeliveryFee())
                .deliveryType(item.getDeliveryType())
                .createdAt(item.getCreatedAt())
                .endDate(item.getEndDate())
                .description(item.getDescription())
                .dibsCount(item.getDibsCount())
                .isLimitless(item.getIsLimitless())
                .name(item.getName())
                .price(item.getPrice())
                .salesCount(item.getSalesCount())
                .startDate(item.getStartDate())
                .viewCount(item.getViewCount())
                .status(item.getStatus())
                .tagsCount(item.getTagsCount())
                .stock(item.getStock())
                .updatedAt(item.getUpdatedAt())
                .build();

    }


}

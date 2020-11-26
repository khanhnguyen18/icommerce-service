package org.icommerce.data.jpa.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.JoinFormula;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "PRODUCT")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PRODUCT")
    Long id;

    String name;

    @OneToMany(mappedBy = "product")
    List<PriceEntity> prices;

    @ManyToOne
    @JoinFormula(value = "(SELECT price.id FROM price WHERE price.product_id = id ORDER BY price.date DESC LIMIT 1)")
    private PriceEntity latestPrice;
}

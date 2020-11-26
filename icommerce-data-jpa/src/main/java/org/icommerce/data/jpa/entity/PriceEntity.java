package org.icommerce.data.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "PRICE")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PRICE")
    Long id;

    double amount;

    LocalDateTime date;

    @ManyToOne
    ProductEntity product;
}

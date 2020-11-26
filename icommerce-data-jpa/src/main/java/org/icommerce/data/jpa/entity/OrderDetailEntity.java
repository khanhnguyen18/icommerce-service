package org.icommerce.data.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.icommerce.domain.vo.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "T_ORDER_DETAIL")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_ORDER_DETAIL")
    Long id;

    int quantity;

    @Enumerated(value = EnumType.STRING)
    Status status;

    @OneToOne
    ProductEntity product;

    @ManyToOne
    OrderEntity order;
}

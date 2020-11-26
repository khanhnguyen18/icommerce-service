package org.icommerce.data.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "T_ORDER")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_ORDER")
    Long id;

    LocalDateTime dateTime;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    List<OrderDetailEntity> orderDetails;

}

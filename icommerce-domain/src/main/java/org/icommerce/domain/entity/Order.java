package org.icommerce.domain.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.List;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(level = PRIVATE)
public class Order {
    Long id;

    List<OrderDetail> orderDetails;
}

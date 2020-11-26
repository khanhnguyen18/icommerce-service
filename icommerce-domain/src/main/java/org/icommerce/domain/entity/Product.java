package org.icommerce.domain.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.icommerce.domain.vo.Colour;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(level = PRIVATE)
public class Product {
    Long id;
    String name;
    Colour colour;
    double price;
}

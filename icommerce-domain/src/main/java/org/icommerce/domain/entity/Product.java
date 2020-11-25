package org.icommerce.domain.entity;


import lombok.Builder;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Builder(toBuilder = true)
@FieldDefaults(level = PRIVATE)
public class Product {
    Long id;
    String name;
}

package org.icommerce.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.icommerce.domain.vo.Colour;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
public class ProductCriteriaDTO {
    String name;
    String colour;
}

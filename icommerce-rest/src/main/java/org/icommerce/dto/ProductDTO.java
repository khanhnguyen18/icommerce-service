package org.icommerce.dto;

import lombok.Getter;
import lombok.Setter;
import org.icommerce.domain.vo.Colour;

@Getter
@Setter
public class ProductDTO {
    Long id;
    String name;
    Colour colour;
}

package org.icommerce.dto;

import lombok.Getter;
import lombok.Setter;
import org.icommerce.domain.vo.Colour;

@Getter
@Setter
public class UpdatePriceDTO {
    Long productId;
    double price;
}

package org.icommerce.mapper;

import org.icommerce.domain.entity.Product;
import org.icommerce.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface ProductDTOMapper {
    ProductDTO map(Product product);
    List<ProductDTO> map(List<Product> product);
}

package org.icommerce.data.mapper;

import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.domain.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface ProductDataMapper {

    Product map(ProductEntity source);

    List<Product> mapList(List<ProductEntity> sources);
}

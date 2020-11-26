package org.icommerce.mapper;

import org.icommerce.domain.vo.ProductCriteria;
import org.icommerce.dto.ProductCriteriaDTO;
import org.mapstruct.Mapper;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.SET_TO_NULL;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = SET_TO_NULL,
        nullValueCheckStrategy = ALWAYS
)
public interface ProductCriteriaMapper {

    ProductCriteria map(ProductCriteriaDTO source);
}

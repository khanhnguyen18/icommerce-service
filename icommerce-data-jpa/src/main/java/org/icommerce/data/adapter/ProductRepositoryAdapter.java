package org.icommerce.data.adapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.icommerce.data.jpa.repository.ProductJpaRepository;
import org.icommerce.data.mapper.ProductDataMapper;
import org.icommerce.domain.entity.Product;
import org.icommerce.domain.repository.ProductRepository;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductRepositoryAdapter implements ProductRepository {

    ProductJpaRepository productJpaRepository;
    ProductDataMapper mapper;

    public List<Product> search() {
        return mapper.mapList(productJpaRepository.findAll());
    }
}

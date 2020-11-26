package org.icommerce.data.adapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.icommerce.data.jpa.entity.ProductEntity;
import org.icommerce.data.jpa.repository.ProductJpaRepository;
import org.icommerce.data.mapper.ProductDataMapper;
import org.icommerce.domain.entity.Product;
import org.icommerce.domain.repository.ProductRepository;
import org.icommerce.domain.vo.ProductCriteria;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductRepositoryAdapter implements ProductRepository {

    ProductJpaRepository productJpaRepository;
    ProductDataMapper mapper;

    @Override
    public Product getDetail(Long id) {
        return mapper.map(productJpaRepository.getById(id));
    }

    public List<Product> search(ProductCriteria productCriteria) {
        return mapper.mapList(productJpaRepository.findAll());
    }
}

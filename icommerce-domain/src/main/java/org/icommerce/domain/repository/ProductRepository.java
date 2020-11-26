package org.icommerce.domain.repository;

import org.icommerce.domain.entity.Product;
import org.icommerce.domain.vo.ProductCriteria;

import java.util.List;

public interface ProductRepository {
    Product getDetail(Long id);
    List<Product> search(ProductCriteria productCriteria);
}

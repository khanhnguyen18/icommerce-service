package org.icommerce.domain.repository;

import org.icommerce.domain.entity.Product;
import org.icommerce.domain.vo.ProductCriteria;

import java.util.List;

public interface ProductRepository {
    List<Product> search(ProductCriteria productCriteria);
    void updatePrice(Long productId, double price);
    Product getDetail(Long id);
}

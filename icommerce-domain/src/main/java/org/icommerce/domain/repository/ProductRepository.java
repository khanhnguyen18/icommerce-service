package org.icommerce.domain.repository;

import org.icommerce.domain.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> search();
}

package org.icomemerce.domain.repository;

import org.icomemerce.domain.entity.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> search();
}
